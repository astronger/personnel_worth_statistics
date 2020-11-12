package com.haort.service;

import com.haort.bean.Confs;

public interface ConfsService {
    boolean addConfs(String startTime,String endTime,String people);

    Confs getConfs();

    boolean updateConfs(String startTime,String endTime,String  people,int id);


    boolean updateConfsFullTime(String fullTime,int id);
}
