package com.haort.mapper;

import com.haort.bean.Confs;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ConfsMapper {
    @Insert("insert into confs (startTime,endTime,people) values (#{startTime},#{endTime},#{people})")
    boolean addConfs(String startTime,String endTime,String people);

    @Select("select * from confs")
    Confs getConfs();

    @Update("update confs set startTime=#{startTime},endTime=#{endTime},people=#{people} where id=#{id}")
    boolean updateConfs(@Param("startTime")String startTime,@Param("endTime") String endTime,@Param("people") String people ,@Param("id")int id);


    @Update("update confs set fullTime=#{fullTime} where id=#{id}")
    boolean updateConfsFullTime(String fullTime, int id);
}
