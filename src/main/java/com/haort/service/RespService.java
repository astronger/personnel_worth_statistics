package com.haort.service;


import com.haort.bean.Resp;

import java.util.List;

public interface RespService {
    boolean addResp(String name,String image ,String phone);
    List<Resp> getAllResp();
}
