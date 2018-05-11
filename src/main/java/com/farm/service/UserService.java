package com.farm.service;

import com.farm.dto.CheckResult;
import com.farm.dto.UserSignInResult;
import com.farm.dto.UserSignUpResult;
import com.farm.vo.UserSignInForm;
import com.farm.vo.UserSignUpForm;

/**
 * 测试案例：User的业务逻辑接口
 *
 * @author Guan WenCong
 * @version 1.0
 * @email 530711667@qq.com
 */

public interface UserService {
    //方法里添加验证码参数
    UserSignUpResult signUp(UserSignUpForm userSignUpForm, String codeSession);

    CheckResult checkUserNameIsExist(String userName);

    CheckResult checkUserEmailIsExist(String userEmail);

    UserSignInResult signIn(UserSignInForm userSignInForm, String codeSession);

}