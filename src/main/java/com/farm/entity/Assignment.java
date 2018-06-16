package com.farm.entity;

import java.util.Date;

public class Assignment {
    private Integer id;

    private Boolean assiState;

    private String assiType;

    private String assiData;

    private String assiNickname;

    private Date assiCreatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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