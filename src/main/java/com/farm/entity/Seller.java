package com.farm.entity;

public class Seller {
    private Integer id;

    private Integer sellerPhone;

    private String sellerName;

    private String sellerCompanyName;

    private String sellerAdd;

    private Integer sellerState;

    private Integer sellerAlipaynum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(Integer sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getSellerCompanyName() {
        return sellerCompanyName;
    }

    public void setSellerCompanyName(String sellerCompanyName) {
        this.sellerCompanyName = sellerCompanyName == null ? null : sellerCompanyName.trim();
    }

    public String getSellerAdd() {
        return sellerAdd;
    }

    public void setSellerAdd(String sellerAdd) {
        this.sellerAdd = sellerAdd == null ? null : sellerAdd.trim();
    }

    public Integer getSellerState() {
        return sellerState;
    }

    public void setSellerState(Integer sellerState) {
        this.sellerState = sellerState;
    }

    public Integer getSellerAlipaynum() {
        return sellerAlipaynum;
    }

    public void setSellerAlipaynum(Integer sellerAlipaynum) {
        this.sellerAlipaynum = sellerAlipaynum;
    }
}