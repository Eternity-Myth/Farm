package farm.service;

import com.farm.dto.UserSignInResult;
import com.farm.dto.UserSignUpResult;
import com.farm.service.UserService;

import com.farm.vo.UserSignInForm;
import com.farm.vo.UserSignUpForm;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BaseServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

//    @Test
//    public void testSignUp() throws Exception {
//        UserSignUpForm userSignUpForm= new UserSignUpForm("123456","123456","123456@qq.com");
//        UserSignUpResult userSignUpResult = userService.signUp(userSignUpForm);
//        logger.info("userSignUpResult={}",userSignUpResult);
//    }

    @Test
    public void testSignIn() throws Exception {
        UserSignInForm userSignInForm = new UserSignInForm("123456","123456");
        UserSignInResult userSignInResult = userService.signIn(userSignInForm,"abcd");
        logger.info("userSignInResult={}",userSignInResult);
    }

    @Test
    public void testSignOut() throws Exception {

    }
}