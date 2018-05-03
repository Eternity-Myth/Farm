package com.farm.exception;

/**
 * Created by Guan WenCong on 2018/5/3.
 */
public class DataExistException extends SystemException {

    public DataExistException(String message) {
        super(message);
    }

    public DataExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
