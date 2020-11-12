package com.haort.mapper;

import com.haort.bean.UerQuestions;
import com.haort.utils.RespResult;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-11-09
 */
@Mapper
public interface UerQuestionsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Select("SELECT id,name,age,phone,position,address,gender,love_imes as loveImes,question_1 as question1,question_2 as question2,question_3 as question3,question_4 as question4,question_5 as question5,question_6 as question6,question_7 as question7,question_8 as question8,question_9 as question9,question_10 as question10,question_11 as question11,question_12 as question12,question_13 as question13,question_14 as question14,question_15 as question15,question_16 as question16,question_17 as question17,question_18 as question18,question_19 as question19,question_20 as question20,question_21 as question21,question_22 as question22,question_23 as question23,question_24 as question24,question_25 as question25,question_26 as question26,question_27 as question27,question_28 as question28,question_29 as question29,question_30 as question30,question_31 as question31,question_32 as question32,question_33 as question33,question_34 as question34,question_35 as question35,question_36 as question36,question_37 as question37,question_38 as question38,question_39 as question39,question_40 as question40,question_41 as question41,question_42 as question42,question_43 as question43,question_44 as question44,question_45 as question45,question_46 as question46,question_47 as question47,question_48 as question48,question_49 as question49,question_50 as question50,question_51 as question51,question_52 as question52,question_53 as question53,question_54 as question54,question_55 as question55,question_56 as question56,question_57 as question57,question_58 as question58,question_59 as question59,question_60 as question60,question_61 as question61,question_62 as question62,question_63 as question63,question_64 as question64,create_time as createTime from uer_question where id=#{id}")
    public UerQuestions selectUerQuestionsById(Long id);

    /**
     * 查询用户列表
     * 
     */
    @Select("select id,name,age,phone,position,gender,create_time as createTime from uer_question")
    public List<UerQuestions> selectUerQuestionsList();

    /**
     * 添加问题表信息
     * 
     * @param uerQuestions
     * @return 结果
     */
    @Insert("insert into uer_question(name,age,phone,position,address,gender,love_imes,question_1,question_2,question_3,question_4,question_5,question_6,question_7,question_8,question_9,question_10,question_11,question_12,question_13,question_14,question_15,question_16,question_17,question_18,question_19,question_20,question_21,question_22,question_23,question_24,question_25,question_26,question_27,question_28,question_29,question_30,question_31,question_32,question_33,question_34,question_35,question_36,question_37,question_38,question_39,question_40,question_41,question_42,question_43,question_44,question_45,question_46,question_47,question_48,question_49,question_50,question_51,question_52,question_53,question_54,question_55,question_56,question_57,question_58,question_59,question_60,question_61,question_62,question_63,question_64,create_time) values (#{name},#{age},#{phone},#{position},#{address},#{gender},#{loveImes},#{question1},#{question2},#{question3},#{question4},#{question5},#{question6},#{question7},#{question8},#{question9},#{question10},#{question11},#{question12},#{question13},#{question14},#{question15},#{question16},#{question17},#{question18},#{question19},#{question20},#{question21},#{question22},#{question23},#{question24},#{question25},#{question26},#{question27},#{question28},#{question29},#{question30},#{question31},#{question32},#{question33},#{question34},#{question35},#{question36},#{question37},#{question38},#{question39},#{question40},#{question41},#{question42},#{question43},#{question44},#{question45},#{question46},#{question47},#{question48},#{question49},#{question50},#{question51},#{question52},#{question53},#{question54},#{question55},#{question56},#{question57},#{question58},#{question59},#{question60},#{question61},#{question62},#{question63},#{question64},#{createTime})")
    public int insertUerQuestions(UerQuestions uerQuestions);

    /**
     * 修改【请填写功能名称】
     * 
     * @param uerQuestions 【请填写功能名称】
     * @return 结果
     */
//    public int updateUerQuestions(UerQuestions uerQuestions);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
//    public int deleteUerQuestionsById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
//    public int deleteUerQuestionsByIds(String[] ids);
}
