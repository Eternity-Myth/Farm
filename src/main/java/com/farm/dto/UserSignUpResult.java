package com.farm.dto;

/**
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
public class UserSignUpResult {

    private boolean isSuccess;
    private String userName;

    public UserSignUpResult(boolean isSuccess, String userName) {
        this.isSuccess = isSuccess;
        this.userName = userName;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
