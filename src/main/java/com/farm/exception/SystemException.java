package com.farm.exception;

/**
 * Created by Guan WenCong on 2018/5/3.
 */
public class SystemException extends RuntimeException {

    public SystemException() {
        super("系统异常");
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
