package com.farm.exception;

/**
 * @author 关文聪
 * @email 530711667@qq.com
 * @version 1.0
 */
public class DataExistException extends SystemException {

    public DataExistException(String message) {
        super(message);
    }

    public DataExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
