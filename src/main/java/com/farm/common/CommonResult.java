package com.farm.common;

/**
 * HTTP请求返回JSON格式结果公共类
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
public class CommonResult<T> {
    public final static boolean SUCCESS = true;
    public final static boolean FAIL = false;
    /**
     * 操作是否成功
     */
    private boolean isSuccess;
    /**
     * 操作结果信息，主要用来存储操作失败时对异常信息做出的提示信息
     */
    private String errorMsg;
    /**
     * 操作结果数据集，用来存储要返回给前端的数据，可以是对象、集合等等
     */
    private T data;

    public CommonResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public CommonResult(boolean isSuccess, T data) {
        this.isSuccess = isSuccess;
        this.data = data;
    }

    public CommonResult(boolean isSuccess, String errorMsg) {
        this.isSuccess = isSuccess;
        this.errorMsg = errorMsg;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
