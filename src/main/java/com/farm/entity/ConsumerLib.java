package com.farm.entity;

import java.util.Date;

public class ConsumerLib extends ConsumerLibKey {
    private Integer userItemNum;

    private Date itemUpdatetime;

    private Boolean userItemState;

    public Integer getUserItemNum() {
        return userItemNum;
    }

    public void setUserItemNum(Integer userItemNum) {
        this.userItemNum = userItemNum;
    }

    public Date getItemUpdatetime() {
        return itemUpdatetime;
    }

    public void setItemUpdatetime(Date itemUpdatetime) {
        this.itemUpdatetime = itemUpdatetime;
    }

    public Boolean getUserItemState() {
        return userItemState;
    }

    public void setUserItemState(Boolean userItemState) {
        this.userItemState = userItemState;
    }
}