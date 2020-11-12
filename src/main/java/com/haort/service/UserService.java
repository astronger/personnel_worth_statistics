package com.haort.service;

import com.haort.bean.User;

import java.util.List;

public interface UserService {

    boolean addUserInfo(String company, String name, String phone, String address, String hrts,String fahuo,String createTime);
    List<User> getAllUser();
    List<User> getAllUserToday();

    List<User> getAllUserByPrint();

    User getImageById(int id);

    User getUserByPhone(String phone);

    List<User> getUserByCompany(String company);
}
