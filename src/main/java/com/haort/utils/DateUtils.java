package com.haort.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间处理的工具类
 */
public class DateUtils {
    /**
     * 获取String类型的datetime
     * @return
     */
    public static String getStrDateTime(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(new Date());
        return currentTime;
    }

    public static String getStrDateTime2(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String currentTime = sdf.format(new Date());
        return currentTime;
    }
}