package com.haort.service.impl;

import com.haort.bean.User;
import com.haort.mapper.UserMapper;
import com.haort.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUserInfo(String company, String name, String phone, String address, String hrts,String fahuo, String createTime) {
        return userMapper.addUserInfo(company, name, phone, address, hrts,fahuo ,createTime);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public List<User> getAllUserToday() {
        return userMapper.getAllUserToday();
    }

    @Override
    public List<User> getAllUserByPrint() {
        return userMapper.getAllUserByPrint();
    }

    @Override
    public User getImageById(int id) {
        return userMapper.getImageById(id);
    }

    @Override
    public User getUserByPhone(String phone) {
        return userMapper.getUserByPhone(phone);
    }

    @Override
    public List<User> getUserByCompany(String company) {
        return userMapper.getUserByCompany(company);
    }

}
