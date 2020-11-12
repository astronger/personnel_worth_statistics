package com.haort.service;

import com.haort.bean.Pages;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PagesService {
    boolean addPages(int fulls,int indexs ,int over , int error ,String createTime);

    boolean updateFulls(int fulls, String id);

    boolean updateIndexs(int indexs,  String id);

    boolean updateOver(int over,   String id);

    boolean updateError(int error,   String id);

    Pages getPagesByDesc();

    List<Pages> getAllPages();
}
