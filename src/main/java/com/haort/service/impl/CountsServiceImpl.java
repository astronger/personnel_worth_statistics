package com.haort.service.impl;

import com.haort.bean.Counts;
import com.haort.mapper.CountsMapper;
import com.haort.service.CountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountsServiceImpl implements CountsService {

    @Autowired
    private CountsMapper countsMapper;

    @Override
    public boolean addSuccessCounts(String startTime, String endTime, int succesCounts,String createTime) {
        return countsMapper.addSuccesCounts(startTime,endTime,succesCounts ,createTime);
    }

    @Override
    public boolean updateSuccessCounts(int succesCounts, String id) {
        return countsMapper.updateSuccessCounts(succesCounts,id);
    }

    @Override
    public boolean addFailCounts(String startTime, String endTime, int failCounts, String createTime) {
        return countsMapper.addFailCounts(startTime,endTime,failCounts,createTime);
    }

    @Override
    public boolean updateFailCounts(int failCounts, String id) {
        return countsMapper.updateFailCounts(failCounts,id);
    }

    @Override
    public Counts getCountsByDesc() {
        return countsMapper.getCountsByDesc();
    }

    @Override
    public List<Counts> getAllCounts() {
        return countsMapper.getAllCounts();
    }


}
