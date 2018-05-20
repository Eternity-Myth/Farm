package com.farm.dto;

/**
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
public class CheckResult {

    private boolean isExist;
    private String msg;

    public CheckResult(boolean isExist, String msg) {
        this.isExist = isExist;
        this.msg = msg;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean isExist) {
        this.isExist = isExist;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CheckResult{" +
                "isExist=" + isExist +
                ", msg='" + msg + '\'' +
                '}';
    }
}
