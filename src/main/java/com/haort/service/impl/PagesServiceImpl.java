package com.haort.service.impl;

import com.haort.bean.Pages;
import com.haort.mapper.PagesMapper;
import com.haort.service.PagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagesServiceImpl implements PagesService {

    @Autowired
    private PagesMapper pagesMapper;

    @Override
    public boolean addPages(int fulls, int indexs, int over, int error, String createTime) {
        return pagesMapper.addPages(fulls,indexs,over,error,createTime);
    }

    @Override
    public boolean updateFulls(int fulls, String id) {
        return pagesMapper.updateFulls(fulls,id);
    }

    @Override
    public boolean updateIndexs(int indexs, String id) {
        return pagesMapper.updateIndexs(indexs,id);
    }

    @Override
    public boolean updateOver(int over, String id) {
        return pagesMapper.updateOver(over,id);
    }

    @Override
    public boolean updateError(int error, String id) {
        return pagesMapper.updateError(error,id);
    }

    @Override
    public Pages getPagesByDesc() {
        return pagesMapper.getPagesByDesc();
    }

    @Override
    public List<Pages> getAllPages() {
        return pagesMapper.getAllPages();
    }
}
