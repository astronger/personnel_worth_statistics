package com.haort.mapper;
import com.haort.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("insert into user (company, name, phone, address, hrts,fahuoTime ,createTime) values (#{company},#{name},#{phone},#{address},#{hrts},#{fahuo} ,#{createTime})")
    boolean addUserInfo(String company, String name, String phone, String address,String hrts,String fahuo, String createTime);

    @Select("select id,company, name ,phone,address,hrts ,createTime ,fahuoTime from user")
    List<User> getAllUser();

    @Select("select id from user where to_days(createTime) = to_days(now())")
    List<User> getAllUserToday();


    @Select("select id,company, name ,phone,address,hrts ,createTime,fahuoTime from user")
    List<User> getAllUserByPrint();

    @Select("select image from user where id=#{id}")
    User getImageById(int id);

    @Select("select id from user where phone=#{phone} ")
   User getUserByPhone(String phone);

    @Select("select id,company,name from user where company=#{company} ")
    List<User> getUserByCompany(String company);
}
