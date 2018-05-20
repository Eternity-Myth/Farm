package com.farm.vo;

/**
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
public class UserSignInForm {
    private String userName;
    private String userPass;
    private String code;

    //表单里添加验证码
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UserSignInForm() {
    }

    public UserSignInForm(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    @Override
    public String toString() {
        return "UserSignForm{" +
                "userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

}