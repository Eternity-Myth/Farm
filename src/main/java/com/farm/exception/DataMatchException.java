package com.farm.exception;

/**
 * @author 关文聪
 * @email 530711667@qq.com
 * @version 1.0
 */
public class DataMatchException extends SystemException {
    public DataMatchException(String message) {
        super(message);
    }

    public DataMatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
