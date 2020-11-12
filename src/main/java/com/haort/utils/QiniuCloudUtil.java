package com.haort.utils;

import com.qiniu.common.QiniuException;
import com.qiniu.storage.BucketManager;
import com.qiniu.util.Auth;
import com.qiniu.util.Base64;
import com.qiniu.util.StringMap;
import com.qiniu.util.UrlSafeBase64;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Configuration
public class QiniuCloudUtil {
    @Value("${qiniu.accessKey}")
    private String accessKey;
    @Value("${qiniu.secretKey}")
    private String secretKey;
    @Value("${qiniu.bucketname}")
    private String bucketname;
    @Value("${qiniu.prefixName}")
    private String prefixName;
    @Value("${qiniu.style}")
    private String style;
    // 密钥
    private Auth auth;

    public Auth getAuth() {
        if (null == auth) {
            auth = Auth.create(accessKey, secretKey);
        }
        return auth;
    }

    public String getUpToken() {
        return getAuth().uploadToken(bucketname, null, 3600, new StringMap().put("insertOnly", 1));
    }

    //base64方式上传
    public String put64image(byte[] base64, String key) throws Exception {
        String file64 = Base64.encodeToString(base64, 0);
        Integer l = base64.length;
        //不同地区 填写不同的url  下面地址是 存储区域查询
        //https://developer.qiniu.com/kodo/manual/1671/region-endpoint
        String url = "http://upload-z2.qiniup.com/putb64/" + l + "/key/" + UrlSafeBase64.encodeToString(key);
        RequestBody rb = RequestBody.create(null, file64);
        Request request = new Request.Builder().
                url(url).
                addHeader("Content-Type", "application/octet-stream")
                .addHeader("Authorization", "UpToken " + getUpToken())
                .post(rb).build();
        OkHttpClient client = new OkHttpClient();
        okhttp3.Response response = client.newCall(request).execute();
        return prefixName + "/" + key;
    }


    // 普通删除
    public RespResult delete(String key) throws IOException {
        // 实例化一个BucketManager对象
        BucketManager bucketManager = new BucketManager(auth);
        // 此处的33是去掉：http://ongsua0j7.bkt.clouddn.com/,剩下的key就是图片在七牛云的名称
        //  key = key.substring(33);
        try {
            // 调用delete方法移动文件
            bucketManager.delete(bucketname, key);
            return RespResult.build(GlobalVariable.API_RETURN_SUCCESS_CODE, GlobalVariable.API_RETURN_FILE_DELETE_SUCCESS);
        } catch (QiniuException e) {
            // 捕获异常信息
            return RespResult.build(GlobalVariable.API_RETURN_NOTFOND_CODE, GlobalVariable.API_RETURN_FILE_DELETE_ERROR, e.getMessage());
        }
    }


    /**
     * @ Description   :  封装上传图片
     * @ Author        :  lxs
     * @ CreateDate    :  2019/10/12 16:19
     */
    public RespResult uploadImage(@RequestParam(value = "file", required = false) MultipartFile file, boolean water,String key) {
        if (StringUtils.isEmpty(file)) {
            return RespResult.build(GlobalVariable.API_RETURN_NOTFOND_CODE, GlobalVariable.API_RETURN_QUERY_NOTNULL_MSG);
        }
        try {
            byte[] bytes = file.getBytes();
            String  url = put64image(bytes, key);
            if (!StringUtils.isEmpty(url) ) {
                return RespResult.build(GlobalVariable.API_RETURN_SUCCESS_CODE, GlobalVariable.API_RETURN_FILE_SUCCESS, url);
            }
            return RespResult.build(GlobalVariable.API_RETURN_NOTFOND_CODE, GlobalVariable.API_RETURN_FILE_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return RespResult.build(GlobalVariable.API_RETURN_ERROR_CODE, GlobalVariable.API_RETURN_FILE_ERROR, e.getMessage());
        }
    }





}