package com.haort.mapper;

import com.haort.bean.Resp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RespMapper {
    @Insert("insert into resp (name,image,phone,time) values (#{name},#{image},#{phone},#{time})")
    boolean addResp(String name,String image ,String phone,String time);

    @Select("select * from resp")
    List<Resp> getAllResp();
}
