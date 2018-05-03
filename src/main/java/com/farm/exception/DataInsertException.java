package com.farm.exception;

/**
 * Created by Guan WenCong on 2018/5/3.
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
