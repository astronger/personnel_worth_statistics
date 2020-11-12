package com.haort.mapper;

import com.haort.bean.Counts;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CountsMapper {
    @Insert("insert into counts (startTime, endTime ,succesCounts ,createTime) values (#{startTime},#{endTime},#{succesCounts},#{createTime}) ")
    boolean addSuccesCounts(String startTime ,String endTime ,int succesCounts,String createTime);

    @Update("update counts set  succesCounts=#{succesCounts} where id=#{id}")
    boolean updateSuccessCounts(@Param("succesCounts")int succesCounts, @Param("id") String id);


    @Insert("insert into counts (startTime, endTime ,failCounts ,createTime) values (#{startTime},#{endTime},#{failCounts},#{createTime}) ")
    boolean addFailCounts(String startTime ,String endTime ,int failCounts,String createTime);

    @Update("")
    boolean updateFailCounts(@Param("failCounts")int failCounts, @Param("id")  String id);

    @Select("select * from counts  order by createTime desc LIMIT 0,1 ")
    Counts getCountsByDesc();

    @Select("select * from counts")
    List<Counts> getAllCounts();
}
