package com.haort.service.impl;

import com.haort.bean.Resp;
import com.haort.mapper.RespMapper;
import com.haort.service.RespService;
import com.haort.utils.DataUtils;
import com.haort.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RespServiceImpl implements RespService {

    @Autowired
    private RespMapper respMapper;

    @Override
    public boolean addResp(String name, String image, String phone) {

        return respMapper.addResp(name,image,phone, DateUtils.getStrDateTime());
    }

    @Override
    public List<Resp> getAllResp() {
        return respMapper.getAllResp();
    }
}
