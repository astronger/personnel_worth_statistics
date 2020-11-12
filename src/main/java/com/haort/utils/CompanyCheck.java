package com.haort.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.Date;

public class CompanyCheck {
    public static String identityCheck(String keyword){
        System.out.println("-----------------开始调用--------------->");
        String key = "0985402642b845ea875026329bf3ebb3";
        int secondTimestamp = getSecondTimestamp(new Date()); //精确到秒的时间戳
        String secretKey ="57CC56F82F831FB006D778C39D812C64"; //密钥
        String token = MD5Util.MD5(key+secondTimestamp+secretKey); //token:验证加密值（key+Timespan+SecretKey组成的32位md5加密的大写字符串）
        //企业关键字模糊查询
        String url = "http://api.qichacha.com/ECIV4/Search?key=" + key + "&dtype=json" + "&keyword=" + keyword;
        //企业关键字获取详细信息
        System.out.println("请求url:" + url);
        String result = "";
        try {
             result = HttpClientUtil.doGet(url,token,secondTimestamp+"");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("<-----------------调用结束---------------");
        return result;
    }
    public static void main(String[] args) throws Exception{
/*        String key = "0985402642b845ea875026329bf3ebb3";
        int secondTimestamp = getSecondTimestamp(new Date()); //精确到秒的时间戳
        String secretKey ="57CC56F82F831FB006D778C39D812C64"; //密钥
        String token = MD5Util.MD5(key+secondTimestamp+secretKey); //token:验证加密值（key+Timespan+SecretKey组成的32位md5加密的大写字符串）
        System.out.println(token);
        identityCheck(token,secondTimestamp+"");*/
    }

    /**
     * 获取精确到秒的时间戳
     * @return
     */
    public static int getSecondTimestamp(Date date){
        if (null == date) {
            return 0;
        }
        String timestamp = String.valueOf(date.getTime());
        int length = timestamp.length();
        if (length > 3) {
            return Integer.valueOf(timestamp.substring(0,length-3));
        } else {
            return 0;
        }
    }


}
