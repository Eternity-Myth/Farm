package com.farm.dto;

/**
 * Created by Guan WenCong on 2018/5/3.
 */
public class UserSignInResult {

    private boolean isSuccess;
    private String userName;

    public UserSignInResult(boolean isSuccess, String userName) {
        this.isSuccess = isSuccess;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserSignInResult{" +
                "isSuccess=" + isSuccess +
                ", userName='" + userName + '\'' +
                '}';
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
