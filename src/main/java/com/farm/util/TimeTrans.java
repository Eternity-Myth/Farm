package com.farm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式转换的工具类
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
public class TimeTrans {

    /**
     * 将字符串类型转换成Date类型
     *
     * @throws ParseException
     */
    public static Date StringToDate(String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        date = sdf.parse(format);
        return date;
    }
}