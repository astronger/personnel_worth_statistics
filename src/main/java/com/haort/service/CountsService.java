package com.haort.service;

import com.haort.bean.Counts;

import java.util.List;

public interface CountsService {
    boolean addSuccessCounts(String startTime,String endTime,int succesCounts,String createTime);

    boolean updateSuccessCounts(int succesCounts,String id);

    boolean addFailCounts(String startTime ,String endTime ,int failCounts,String createTime);

    boolean updateFailCounts(int failCounts,String id);


    Counts getCountsByDesc();

    List<Counts> getAllCounts();
}
