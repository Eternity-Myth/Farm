package com.farm.entity;

public class ConsumerInfo {
    private Integer id;

    private String conPhone;

    private String conName;

    private Boolean conState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConPhone() {
        return conPhone;
    }

    public void setConPhone(String conPhone) {
        this.conPhone = conPhone == null ? null : conPhone.trim();
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName == null ? null : conName.trim();
    }

    public Boolean getConState() {
        return conState;
    }

    public void setConState(Boolean conState) {
        this.conState = conState;
    }
}