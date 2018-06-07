package com.farm.entity;

public class SellerLib {
    private Integer sellerlibId;

    private Integer sellerId;

    private Integer itemId;

    private Integer sellerItemNum;

    private String itemUpdatetime;

    private Boolean sellerItemState;

    public Integer getSellerlibId() {
        return sellerlibId;
    }

    public void setSellerlibId(Integer sellerlibId) {
        this.sellerlibId = sellerlibId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getSellerItemNum() {
        return sellerItemNum;
    }

    public void setSellerItemNum(Integer sellerItemNum) {
        this.sellerItemNum = sellerItemNum;
    }

    public String getItemUpdatetime() {
        return itemUpdatetime;
    }

    public void setItemUpdatetime(String itemUpdatetime) {
        this.itemUpdatetime = itemUpdatetime == null ? null : itemUpdatetime.trim();
    }

    public Boolean getSellerItemState() {
        return sellerItemState;
    }

    public void setSellerItemState(Boolean sellerItemState) {
        this.sellerItemState = sellerItemState;
    }
}
