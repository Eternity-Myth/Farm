package com.farm.entity;

import java.util.Date;

public class User {

    private int id;
    private String userName;
    private String userPass;
    private String userEmail;
    private Date registerTime;
    private byte status;


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
                ", status=" + status +
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


    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }


}

