package com.farm.entity;

public class ConsumerInfo {
    private Integer conId;

    private String conPhone;

    private String conNickname;

    private Boolean conState;

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public String getConPhone() {
        return conPhone;
    }

    public void setConPhone(String conPhone) {
        this.conPhone = conPhone == null ? null : conPhone.trim();
    }

    public String getConNickname() {
        return conNickname;
    }

    public void setConNickname(String conNickname) {
        this.conNickname = conNickname == null ? null : conNickname.trim();
    }

    public Boolean getConState() {
        return conState;
    }

    public void setConState(Boolean conState) {
        this.conState = conState;
    }
}