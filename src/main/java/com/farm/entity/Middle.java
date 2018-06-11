package com.farm.entity;

import java.util.List;

//实现菜地信息和农作物信息连接的中间表实体类
public class Middle {
    private Integer mFid;

    private Integer mCid;

    private String mCname;

    private Float mCprofit;

    private Integer quantity;

    private Boolean status;

    private List<Crops> crops;

    public List<Crops> getCrops() {
        return crops;
    }

    public void setCrops(List<Crops> crops) {
        this.crops = crops;
    }

    public Integer getmFid() {
        return mFid;
    }

    public void setmFid(Integer mFid) {
        this.mFid = mFid;
    }

    public Integer getmCid() {
        return mCid;
    }

    public void setmCid(Integer mCid) {
        this.mCid = mCid;
    }

    public String getmCname() {
        return mCname;
    }

    public void setmCname(String mCname) {
        this.mCname = mCname == null ? null : mCname.trim();
    }

    public Float getmCprofit() {
        return mCprofit;
    }

    public void setmCprofit(Float mCprofit) {
        this.mCprofit = mCprofit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
