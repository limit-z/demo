/**   
 * Copyright © 2018 Beijing RainXing Technology. Tech Ltd. All rights reserved.
 * 
 * @Package: com.rainxing.app.service.impl 
 * @author: ybzhu   
 * @date: 2018年6月1日 下午4:07:11 
 */
package com.rainxing.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rainxing.app.mapper.CheckValueMapper;
import com.rainxing.app.mapper.ChecksMapper;
import com.rainxing.app.pojo.CheckValue;
import com.rainxing.app.pojo.Checks;
import com.rainxing.app.service.CheckValueService;
import com.rainxing.app.utils.IDUtils;

/** 
 * @ClassName: CheckValueServiceImpl 
 * @Description: TODO
 * @author: ybzhu
 * @date: 2018年6月1日 下午4:07:11  
 */
@Service
public class CheckValueServiceImpl implements CheckValueService{
	@Autowired
	private ChecksMapper checksMapper;
	// @Fields checkValueMapper : 检查表  
	@Autowired
	private CheckValueMapper checkValueMapper;
	
	/**
	 * @Title: getAllByID
	 * @Description: 通过外键企业ID查询所有企业ID下的检查表信息
	 * @param autoID
	 * @return
	 * @throws Exception 
	 * @see com.rainxing.app.service.CheckService#getAllByID(java.lang.String) 
	 */ 
	@Override
	public List<CheckValue> getAllByID(String autoID) throws Exception {
		// TODO Auto-generated method stub
		return checkValueMapper.getAllByID(autoID);
	}

	/**
	 * @Title: findByID
	 * @Description: 通过主键检查表ID 查询检查表信息
	 * @param autoID
	 * @return
	 * @throws Exception 
	 * @see com.rainxing.app.service.CheckService#findByID(java.lang.String) 
	 */ 
	@Override
	public CheckValue findByID(String autoID) throws Exception {
		// TODO Auto-generated method stub
		return checkValueMapper.selectByPrimaryKey(autoID);
	}

	/**
	 * @Title: insert
	 * @Description: 新增检查表信息
	 * @param checkValue
	 * @throws Exception 
	 * @see com.rainxing.app.service.CheckService#insert(com.rainxing.app.pojo.CheckValue) 
	 */ 
	@Override
	public int insert(CheckValue checkValue) throws Exception {
		// TODO Auto-generated method stub
		checkValue.setAutoID(String.valueOf(IDUtils.genItemId()));
		int insert = checkValueMapper.insert(checkValue);
		return insert;
	}

	/**
	 * @Title: delById
	 * @Description: 通过主键ID删除检查表
	 * @param autoID
	 * @throws Exception 
	 * @see com.rainxing.app.service.CheckService#delById(java.lang.String) 
	 */ 
	@Override
	public void delById(String autoID) throws Exception {
		// TODO Auto-generated method stub
		checkValueMapper.deleteByPrimaryKey(autoID);
	}

	/**
	 * @Title: findByChecksID
	 * @Description: 通过checksId查询检查表信息 
	 * @param autoID
	 * @return 
	 * @see com.rainxing.app.service.CheckValueService#findByChecksID(java.lang.String) 
	 */ 
	@Override
	public Checks findByChecksID(String autoID) {
		// TODO Auto-generated method stub
		return checksMapper.selectByPrimaryKey(autoID);
	}

	/**
	 * @Title: findByName
	 * @Description: 通过企业名字查询检查表数据 
	 * @param cname
	 * @return 
	 * @see com.rainxing.app.service.CheckValueService#findByName(java.lang.String) 
	 */ 
	@Override
	public List<CheckValue> findByName(String cname) {
		// TODO Auto-generated method stub
		return checksMapper.findByName(cname);
	}

	/**
	 * @Title: getAllByCheckID
	 * @Description: 通过检查表外键CheckID（检查表主键）查询检查表信息 
	 * @param autoID
	 * @return 
	 * @see com.rainxing.app.service.CheckValueService#getAllByCheckID(java.lang.String) 
	 */ 
	@Override
	public List<CheckValue> getAllByCheckID(String autoID) {
		// TODO Auto-generated method stub
		return checkValueMapper.getAllByCheckID(autoID);
	}

}
