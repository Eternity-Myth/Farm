package com.farm.exception;

/**
 * @author 关文聪
 * @email 530711667@qq.com
 * @version 1.0
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
