package com.farm.enums;

/**
 * Created by Guan WenCong on 2018/5/3.
 */
public enum AccountStatusEnum {
    ACTIVED((byte) 1, "可用状态"), DISABLED((byte) 0, "禁用状态");
    private byte status;
    private String statusInfo;

    AccountStatusEnum(byte status, String statusInfo) {
        this.status = status;
        this.statusInfo = statusInfo;
    }

    public static AccountStatusEnum accountStatusOf(byte index) {
        for (AccountStatusEnum accountStatusEnum : values()) {
            if (accountStatusEnum.getStatus() == index) {
                return accountStatusEnum;
            }
        }
        return null;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }
}
