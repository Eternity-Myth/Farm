package com.farm.exception;

/**
 * @author 关文聪
 * @email 530711667@qq.com
 * @version 1.0
 */
public class DataInsertException  extends  SystemException{
    public DataInsertException() {
        super("数据插入失败");
    }

    public DataInsertException(String message) {
        super(message);
    }

    public DataInsertException(String message, Throwable cause) {
        super(message, cause);
    }
}
