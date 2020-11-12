package com.haort.mapper;

import com.haort.bean.Pages;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PagesMapper {

    @Insert("insert into pages (fulls, indexs ,over ,error ,createTime) values (#{fulls},#{indexs},#{over},#{error},#{createTime}) ")
    boolean addPages(int fulls,int indexs ,int over , int error ,String createTime);


    @Update("update pages set  fulls=#{fulls} where id=#{id}")
    boolean updateFulls(@Param("fulls")int full, @Param("id") String id);

    @Update("update pages set  indexs=#{indexs} where id=#{id}")
    boolean updateIndexs(@Param("indexs")int indexs, @Param("id") String id);

    @Update("update pages set  over=#{over} where id=#{id}")
    boolean updateOver(@Param("over")int over, @Param("id") String id);


    @Update("update pages set  error=#{error} where id=#{id}")
    boolean updateError(@Param("error")int error, @Param("id") String id);


    @Select("select * from pages  order by createTime desc LIMIT 0,1 ")
    Pages getPagesByDesc();

    @Select("select * from pages")
    List<Pages> getAllPages();
}
