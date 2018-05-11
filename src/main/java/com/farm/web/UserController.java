package com.farm.web;


import com.farm.common.CommonResult;
import com.farm.common.CommonValue;
import com.farm.dto.CheckResult;
import com.farm.dto.UserSignInResult;
import com.farm.dto.UserSignUpResult;
import com.farm.service.UserService;
import com.farm.util.ValidateCode;
import com.farm.vo.UserSignInForm;
import com.farm.vo.UserSignUpForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Guan WenCong on 2018/5/3.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public CommonResult<UserSignUpResult> signUp(HttpSession session, UserSignUpForm userSignUpForm) {
//将生成的验证码存起来用来比较
        String codeSession = (String) session.getAttribute("validateCode");

        logger.info("userSignUpForm={}", userSignUpForm);
        try {
            UserSignUpResult userSignUpResult = userService.signUp(userSignUpForm, codeSession);
            return new CommonResult<>(true, userSignUpResult);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new CommonResult<>(false, e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public CommonResult<UserSignInResult> signIn(HttpSession session, UserSignInForm userSignInForm,
                                                 HttpServletRequest request) {
//将生成的验证码存起来用来比较
        String codeSession = (String) session.getAttribute("validateCode");

        logger.info("userSignInForm={}", userSignInForm);
        try {
            UserSignInResult userSignInResult = userService.signIn(userSignInForm, codeSession);
            //判断登录成功则将用户名保存在session中
            if (userSignInResult.isSuccess()) {
                HttpSession userNameSession = request.getSession(true);
                userNameSession.setAttribute("userNameSession", userSignInResult.getUserName());
                userNameSession.setMaxInactiveInterval(CommonValue.USER_SESSION_TIMEOUT_MINUTE);
            } else {
                request.getRequestDispatcher("/webapp/sign-in.jsp");
            }
            return new CommonResult<>(true, userSignInResult);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new CommonResult<>(false, e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value = "/checkAccount", method = RequestMethod.POST)
    public CommonResult<CheckResult> checkAccount(String userName) {
        CheckResult checkResult = userService.checkUserNameIsExist(userName);
        return new CommonResult<>(true, checkResult);
    }

    @ResponseBody
    @RequestMapping(value = "/checkEmail", method = RequestMethod.POST)
    public CommonResult<CheckResult> checkEmail(String userEmail) {
        CheckResult checkResult = userService.checkUserEmailIsExist(userEmail);
        return new CommonResult<>(true, checkResult);
    }

    /**
     * 生成验证码
     *
     * @param request
     * @param response
     * @throws IOException
     * @ValidateCode.generateTextCode(验证码字符类型,验证码长度,需排除的特殊字符)
     * @ValidateCode.generateImageCode(文本验证码,图片宽度,图片高度,干扰线的条数,字符的高低位置是否随机,图片颜色,字体颜色,干扰线颜色)
     */

    @RequestMapping(value = "/validateCode")
    public void validateCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Cache-Control", "no-cache");
        String verifyCode = ValidateCode.generateTextCode(ValidateCode.TYPE_NUM_LOWER, 4, null);
        request.getSession().removeAttribute("validateCode");
        request.getSession().setAttribute("validateCode", verifyCode);
        response.setContentType("image/jpeg");
        BufferedImage bim = ValidateCode.generateImageCode(verifyCode, 90, 30, 5, true, Color.WHITE, Color.BLUE, null);
        ImageIO.write(bim, "JPEG", response.getOutputStream());
    }


    @ResponseBody
    @RequestMapping(value = "/signOut", method = RequestMethod.GET)
    public CommonResult signOut(HttpServletRequest request) {
        HttpSession userNameSession = request.getSession(true);
        userNameSession.removeAttribute("userNameSession");
        return new CommonResult(true);
    }

}