package com.farm.exception;

/**
 * Created by Guan WenCong on 2018/5/3.
 */
public class DataMatchException extends SystemException {
    public DataMatchException(String message) {
        super(message);
    }

    public DataMatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
