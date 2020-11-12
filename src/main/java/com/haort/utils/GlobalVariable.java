package com.haort.utils;

public interface GlobalVariable {

	/**
	 * 成功的code
	 */
	Integer API_RETURN_SUCCESS_CODE=200;
	/**
	 * 未查到的code
	 */
	Integer API_RETURN_NOTFOND_CODE=400;

	/**
	 *参数不能为空的code
	 */
	Integer API_RETURN_NOTNULL_CODE=403;

	/**
	 *数据不存在的code
	 */
	Integer API_RETURN_DATE_NOTISEXIT_CODE=405;


	/**
	 *数据存在的code
	 */
	Integer API_RETURN_DATE_ISEXIT_CODE=406;

	/**
	 *热门毕设超出设置 值   12个
	 *
	 */
	Integer API_RETURN_DATE_SIZEOUT_CODE=407;


	/**
	 * 热门毕设不能超过12个
	 */
	String API_RETURN_DATE_SIZEOUT_MSG="热门毕设不能超过12个";


	/**
	 * 失败的code
	 */
	Integer API_RETURN_ERROR_CODE=500;
	/**
	 * 查询成功的消息
	 */
	String API_RETURN_QUERY_SUCCESS_MSG="查询成功";

	/**
	 * 未查到任何信息
	 */
	String API_RETURN_QUERY_NOTFOND_MSG="未查到任何信息";
	/**
	 * 查询失败的消息
	 */
	String API_RETURN_QUERY_ERROR_MSG="查询失败";
	/**
	 * 参数不能为空的消息
	 */
	String API_RETURN_QUERY_NOTNULL_MSG="参数不能为空";
	/**
	 * 插入成功的消息
	 */
	String API_RETURN_ISERT_SUCCESS_MSG="插入成功";
	/**
	 * 插入失败的消息
	 */
	String API_RETURN_ISERT_ERROR_MSG="插入失败";
	/**
	 * 修改成功的消息
	 */
	String API_RETURN_UPDATE_SUCCESS_MSG="修改成功";
	/**
	 * 修改失败的消息
	 */
	String API_RETURN_UPDATE_ERROR_MSG="修改失败";

	/**
	 * 删除成功的消息
	 */
	String API_RETURN_Delete_SUCCESS_MSG="删除成功";
	/**
	 *  删除失败的消息
	 */
	String API_RETURN_Delete_ERROR_MSG="删除失败";

	/**
	 * 数据错误的消息
	 */
	String API_RETURN_DATA_ERROR="数据异常";
	/**
	 * 系统异常的消息
	 */
	String API_RETURN_SYSTEM_ERROR="系统异常";

	/**
	 * 文件上传异常
	 */
	String API_RETURN_FILE_ERROR="文件上传异常";

	/**
	 * 文件上传成功
	 */
	String API_RETURN_FILE_SUCCESS="文件上传成功";

	/**
	 * 文件上传成功
	 */
	String API_RETURN_FILE_FAIL="文件上传失败";
	/**
	 * 调用的服务找不到
	 */
	String API_CALL_EXCEPTION="服务不见鸟，稍后再试！！";
	/**
	 * 用户在线
	 */
	String API_USER_ONLINE="当前用户已在线！！";
	/**
	 * 用户不在线
	 */
	String API_USER_NOT_ONLINE="用户不在线！！";

	/**
	 * 阿里云 图片样式  objectName
	 */
	String ALIYUN_OBJECTNAME_BANNER="banner";

	String API_RETURN_DATA_ISEXIT_MSG="该数据已存在,请勿重复提交";

	String API_RETURN_DATA_NOTISEXIT_MSG="操作有误，该数据不存在";

	/**
	 *文件删除成功
	 */
	String API_RETURN_FILE_DELETE_SUCCESS="文件删除成功";

	/**
	 *文件删除失败
	 */
	String API_RETURN_FILE_DELETE_ERROR="文件删除失败";


	/**
	 *用户名或密码不能为空
	 */
	String API_RETURN_USERPASS_NOTNULL="用户名或密码不能为空";

	/**
	 *登录成功
	 */
	String API_RETURN_LOGIN_SUCCESS="登录成功";

	/**
	 *登录失败,请核实用户名或密码
	 */
	String API_RETURN_LOGIN_ERROR="登录失败,请核实用户名或密码";


	/**
	 * 主键ID不能为空的消息
	 */
	String API_RETURN_ID_NOTNULL_MSG="主键ID不能为空";

	/**
	 * 用户名或密码不能为空
	 */
	String API_RETURN_USERNAMEANDPASSWORD_NOTNULL_MSG="用户名或密码不能为空";
}
