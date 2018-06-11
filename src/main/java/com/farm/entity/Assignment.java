package com.farm.entity;

import java.util.Date;

public class Assignment {
    private Integer assiId;

    private Boolean assiState;

    private String assiType;

    private String assiData;

    private String assiPhone;

    private String assiNickname;

    private Date assiCreatetime;

    public Integer getAssiId() {
        return assiId;
    }

    public void setAssiId(Integer assiId) {
        this.assiId = assiId;
    }

    public Boolean getAssiState() {
        return assiState;
    }

    public void setAssiState(Boolean assiState) {
        this.assiState = assiState;
    }

    public String getAssiType() {
        return assiType;
    }

    public void setAssiType(String assiType) {
        this.assiType = assiType == null ? null : assiType.trim();
    }

    public String getAssiData() {
        return assiData;
    }

    public void setAssiData(String assiData) {
        this.assiData = assiData == null ? null : assiData.trim();
    }

    public String getAssiPhone() {
        return assiPhone;
    }

    public void setAssiPhone(String assiPhone) {
        this.assiPhone = assiPhone == null ? null : assiPhone.trim();
    }

    public String getAssiNickname() {
        return assiNickname;
    }

    public void setAssiNickname(String assiNickname) {
        this.assiNickname = assiNickname == null ? null : assiNickname.trim();
    }

    public Date getAssiCreatetime() {
        return assiCreatetime;
    }

    public void setAssiCreatetime(Date assiCreatetime) {
        this.assiCreatetime = assiCreatetime;
    }
}