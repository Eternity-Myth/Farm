package com.farm.entity;

import java.util.Date;

public class User {

    private int id;
    private String userName;
    private String userPass;
    private String userEmail;
    private Date registerTime;
    private String nickName;
    private byte status;
    private byte sex;
    private Date birth;
    private String profile;


    public User() {
    }

    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public User(String userName, String userPass, String userEmail) {
        this.userName = userName;
        this.userPass = userPass;
        this.userEmail = userEmail;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", registerTime=" + registerTime +
                ", nickName='" + nickName + '\'' +
                ", status=" + status +
                ", sex=" + sex +
                ", birth=" + birth +
                ", profile='" + profile + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}

