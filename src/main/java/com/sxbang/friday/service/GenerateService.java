package com.sxbang.friday.service;


import com.sxbang.friday.dto.BeanField;
import com.sxbang.friday.dto.GenerateInput;

import java.util.List;

public interface GenerateService {

	/**
	 * 获取数据库表信息
	 * 
	 * @param tableName
	 * @return
	 */
	List<BeanField> listBeanField(String tableName);

	/**
	 * 转成驼峰并大写第一个字母
	 * 
	 * @param string
	 * @return
	 */
	String upperFirstChar(String string);

	/**
	 * 生成代码
	 * 
	 * @param input
	 */
	void saveCode(GenerateInput input);

	/**
	 *
	 *  查找数据库中所有表名
	 * @return list
	 */
	List findTables();

}
