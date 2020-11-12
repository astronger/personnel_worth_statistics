package com.haort.service.impl;

import java.util.List;

import com.haort.bean.UerQuestions;
import com.haort.mapper.UerQuestionsMapper;
import com.haort.service.IUerQuestionsService;
import com.haort.utils.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-11-09
 */
@Service
public class UerQuestionsServiceImpl implements IUerQuestionsService
{
    @Autowired
    private UerQuestionsMapper uerQuestionsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public UerQuestions selectUerQuestionsById(Long id)
    {
        return uerQuestionsMapper.selectUerQuestionsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param  【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<UerQuestions> selectUerQuestionsList()
    {
        return uerQuestionsMapper.selectUerQuestionsList();
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param uerQuestions 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUerQuestions(UerQuestions uerQuestions)
    {
        return uerQuestionsMapper.insertUerQuestions(uerQuestions);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param uerQuestions 【请填写功能名称】
     * @return 结果
     */
//    @Override
//    public int updateUerQuestions(UerQuestions uerQuestions)
//    {
//        return uerQuestionsMapper.updateUerQuestions(uerQuestions);
//    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
//    @Override
//    public int deleteUerQuestionsByIds(String ids)
//    {
//        return uerQuestionsMapper.deleteUerQuestionsByIds(Convert.toStrArray(ids));
//    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
//    @Override
//    public int deleteUerQuestionsById(Long id)
//    {
//        return uerQuestionsMapper.deleteUerQuestionsById(id);
//    }
}
