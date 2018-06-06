/**   
 * Copyright © 2018 Beijing RainXing Technology. Tech Ltd. All rights reserved.
 * 
 * @Package: com.rainxing.app.service 
 * @author: ybzhu   
 * @date: 2018年6月1日 下午4:06:52 
 */
package com.rainxing.app.service;

import java.util.List;

import com.rainxing.app.pojo.CheckValue;
import com.rainxing.app.pojo.Checks;

/** 
 * @ClassName: CheckService 
 * @Description: 检查 表 接口
 * @author: ybzhu
 * @date: 2018年6月1日 下午4:06:52  
 */
public interface CheckValueService {
	
	//通过外键企业ID查询所有企业ID下的检查表信息
	List<CheckValue> getAllByID(String autoID) throws Exception;
	//通过主键检查表ID 查询检查表信息
	CheckValue findByID(String autoID) throws Exception;
	//新增检查表信息
	int insert(CheckValue checkValue) throws Exception;
	//通过主键ID删除检查表
	void delById(String autoID) throws Exception;
	/** 
	* @Title: findByChecksID 
	* @Description: 通过checksId查询检查表信息 
	* @param autoID
	* @return CheckValue
	* @author ybzhu
	* @date 2018年6月4日下午6:04:52
	*/ 
	Checks findByChecksID(String autoID);
	/** 
	* @Title: findByName 
	* @Description: TODO 
	* @param cname
	* @return List<CheckValue>
	* @author ybzhu
	* @date 2018年6月4日下午6:18:13
	*/ 
	List<CheckValue> findByName(String cname);
	/** 
	* @Title: getAllByCheckID 
	* @Description: 通过检查表外键CheckID（检查表主键）查询检查表信息  
	* @param autoID
	* @return List<CheckValue>
	* @author ybzhu
	* @date 2018年6月5日上午10:26:29
	*/ 
	List<CheckValue> getAllByCheckID(String autoID);
}
