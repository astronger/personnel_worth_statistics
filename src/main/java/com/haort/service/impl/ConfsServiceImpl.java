package com.haort.service.impl;

import com.haort.bean.Confs;
import com.haort.mapper.ConfsMapper;
import com.haort.service.ConfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfsServiceImpl implements ConfsService {

    @Autowired
    private ConfsMapper confsMapper;


    public boolean addConfs(String startTime,String endTime,String people) {
        return  confsMapper.addConfs(startTime, endTime,people);
    }

    @Override
    public Confs getConfs() {
        return confsMapper.getConfs();
    }

    @Override
    public boolean updateConfs(String startTime, String endTime,String people ,int id) {
        return confsMapper.updateConfs(startTime,endTime,people ,id);
    }

    @Override
    public boolean updateConfsFullTime(String fullTime, int id) {
        return confsMapper.updateConfsFullTime(fullTime,id);
    }
}
