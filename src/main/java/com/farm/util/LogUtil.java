package com.farm.util;


import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

/**
 * 用于控制日志打印的工具类
 */
public class LogUtil {
    private static Logger logger = Logger.getLogger(LogUtil.class);

    /**
     * @param classname 类名
     * @param method    方法名
     * @param errorMsg  异常信息
     */
    public static void writeLogs(String classname, String method,
                                 String errorMsg) {
        try {
            MDC.put("classname", classname);
            MDC.put("method", method);
            if (errorMsg.isEmpty()) {
                MDC.put("statusCode", 0);
                logger.info("");
            } else {
                MDC.put("statusCode", -1);
                logger.error(errorMsg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MDC.clear();
        }
    }
}
