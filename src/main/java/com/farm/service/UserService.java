package com.farm.service;

import com.farm.dto.CheckResult;
import com.farm.dto.UserSignInResult;
import com.farm.dto.UserSignUpResult;
import com.farm.entity.User;
import com.farm.vo.UserSignInForm;
import com.farm.vo.UserSignUpForm;

import java.util.List;

/**
 * User的业务逻辑接口
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */

public interface UserService {
    UserSignUpResult signUp(UserSignUpForm userSignUpForm, String codeSession);

    CheckResult checkUserNameIsExist(String userName);

    CheckResult checkUserEmailIsExist(String userEmail);

    UserSignInResult signIn(UserSignInForm userSignInForm, String codeSession);

    public List<User> getAll();

    public void deleteBatch(List<Integer> del_ids);

    public void deleteUser(Integer id);

    public void changeStatus(User user);

    public User getUserByName(String name);
}