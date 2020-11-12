package com.haort.utils;

import java.util.Random;
import java.util.UUID;

/**
 * 数据相关的工具类
 */
public class DataUtils {
    /**
     * 获取主键
     * @return
     */
    public static String getPK(){
        UUID uuid = UUID.randomUUID();
        String strID = uuid.toString().replaceAll("-", "");
        strID =  strID.substring(0,20);
        return strID;

    }
    /**
     * 图片名生成
     */
    public static String genImageName() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //long millis = System.nanoTime();
        //加上三位随机数
        Random random = new Random();
        int end3 = random.nextInt(999);
        //如果不足三位前面补0
        String str = millis + String.format("%03d", end3);
        return str;
    }
}