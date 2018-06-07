package com.farm.service.impl;


import com.farm.common.CommonValue;
import com.farm.dao.UserDao;
import com.farm.dto.CheckResult;
import com.farm.dto.UserSignInResult;
import com.farm.dto.UserSignUpResult;
import com.farm.entity.User;
import com.farm.entity.UserExample;
import com.farm.exception.DataExistException;
import com.farm.exception.DataInsertException;
import com.farm.exception.DataMatchException;
import com.farm.exception.SystemException;
import com.farm.service.UserService;
import com.farm.vo.UserSignInForm;
import com.farm.vo.UserSignUpForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * User的业务逻辑实现类
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserDao userDao;


    @Override
    public void deleteBatch(List<Integer> ids) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        //delete from xxx where id in(1,2,3)
        criteria.andIdIn(ids);
        userDao.deleteByExample(example);
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteByPrimaryKey(id);
    }

    //查看所有用户信息
    @Override
    public List<User> getAll() {
        return userDao.selectByExample(null);
    }

    @Override
    public UserSignUpResult signUp(UserSignUpForm userSignUpForm, String codeSession)
            throws SystemException {

        // 检查用户账户名和邮箱是否已存在
        if (checkUserIsExistByName(userSignUpForm.getUserName())) {
            throw new DataExistException("用户名" + CommonValue.CANNT_USE);
        }
        if (checkUserIsExistByEmail(userSignUpForm.getUserEmail())) {
            throw new DataExistException("邮箱" + CommonValue.CANNT_USE);
        } else {
            if (!codeSession.equalsIgnoreCase(userSignUpForm.getCode())) {
//将存储的验证码和用户输入的验证码进行比较，错误则抛出异常
                throw new DataMatchException("验证码错误");
            } else {
                User user = new User(
                        userSignUpForm.getUserName(),
                        userSignUpForm.getUserPass(),
                        userSignUpForm.getUserEmail());

                try {
                    int insertCount = userDao.insert(user);
                    if (insertCount > 0) {
                        return new UserSignUpResult(true, userSignUpForm.getUserName());
                    } else {
                        throw new DataInsertException();
                    }
                } catch (Exception e) {
                    logger.error(e.getMessage(), e);
                    throw new DataInsertException();
                }
            }
        }
    }

    private boolean checkUserIsExistByName(String userName) {
        User user = userDao.selectByUserName(userName);
        if (user != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public CheckResult checkUserNameIsExist(String userName) {
        if (checkUserIsExistByName(userName)) {
            return new CheckResult(true, CommonValue.CANNT_USE);
        } else {
            return new CheckResult(false, CommonValue.CAN_USE);
        }
    }

    private boolean checkUserIsExistByEmail(String userEmail) {
        User user = userDao.selectByUserEmail(userEmail);
        if (user != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public CheckResult checkUserEmailIsExist(String userEmail) {
        if (checkUserIsExistByEmail(userEmail)) {
            return new CheckResult(true, CommonValue.CANNT_USE);
        } else {
            return new CheckResult(false, CommonValue.CAN_USE);
        }
    }

    @Override
    public UserSignInResult signIn(UserSignInForm userSignInForm, String codeSession) {
        // TODO 密码加密解密处理


        User user = userDao.selectByUserName(userSignInForm.getUserName());
        if (user == null) {
            throw new DataExistException("用户不存在");
        }
        if (!user.getUserPass().equals(userSignInForm.getUserPass())) {
            throw new DataMatchException("用户名或密码错误");
        } else {
            if (user.getStatus() != true) {
                throw new DataMatchException("用户已被禁用");
            }
            //校验验证码,无视大小写
            if (!codeSession.equalsIgnoreCase(userSignInForm.getCode())) {

                //将存储的验证码和用户输入的验证码进行比较，错误则抛出异常
                throw new DataMatchException("验证码错误");
            } else {
                // PS 用户登录状态保存处理操作在Controller中
                return new UserSignInResult(true, userSignInForm.getUserName());
            }
        }
    }

    @Override
    public void changeStatus(User user) {
        userDao.changeStatus(user);
    }

    @Override
    public User getUserByName(String name) {
        return userDao.selectByUserName(name);
    }
}