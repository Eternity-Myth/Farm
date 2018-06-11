package com.farm.entity;

public class SellerInfo {
    private Integer id;

    private String sellerPhone;

    private String sellerName;

    private String sellerCompanyName;

    private String sellerAdd;

    private Boolean sellerState;

    private String sellerAlipaynum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone == null ? null : sellerPhone.trim();
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

    public Boolean getSellerState() {
        return sellerState;
    }

    public void setSellerState(Boolean sellerState) {
        this.sellerState = sellerState;
    }

    public String getSellerAlipaynum() {
        return sellerAlipaynum;
    }

    public void setSellerAlipaynum(String sellerAlipaynum) {
        this.sellerAlipaynum = sellerAlipaynum == null ? null : sellerAlipaynum.trim();
    }
}