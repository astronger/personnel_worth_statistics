package com.haort.service;

import java.util.List;

import com.haort.bean.UerQuestions;
import com.haort.utils.RespResult;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-11-09
 */
public interface IUerQuestionsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public UerQuestions selectUerQuestionsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param  【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<UerQuestions> selectUerQuestionsList();

    /**
     * 新增【请填写功能名称】
     * 
     * @param uerQuestions 【请填写功能名称】
     * @return 结果
     */
     int insertUerQuestions(UerQuestions uerQuestions);

    /**
     * 修改【请填写功能名称】
     * 
     * @param uerQuestions 【请填写功能名称】
     * @return 结果
     */
//    public int updateUerQuestions(UerQuestions uerQuestions);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
//    public int deleteUerQuestionsByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
//    public int deleteUerQuestionsById(Long id);
}
