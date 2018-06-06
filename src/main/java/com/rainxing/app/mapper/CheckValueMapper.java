package com.rainxing.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rainxing.app.pojo.CheckValue;

public interface CheckValueMapper {
    int insert(CheckValue record);

    int insertSelective(CheckValue record);

    CheckValue selectByPrimaryKey(String autoID);
    
    int deleteByPrimaryKey(String autoID);
    
	/** 
	* @Title: getAllByID 
	* @Description: 通过外键企业ID查询所有企业ID下的检查表信息 
	* @param autoID
	* @return List<CheckValue>
	* @author ybzhu
	* @date 2018年6月1日下午5:06:44
	*/ 
	List<CheckValue> getAllByID(@Param("customerID") String autoID);

	/** 
	* @Title: getAllByCheckID 
	* @Description: 通过检查表外键CheckID（检查表主键）查询检查表信息 
	* @param autoID
	* @return List<CheckValue>
	* @author ybzhu
	* @date 2018年6月5日上午10:28:06
	*/ 
	List<CheckValue> getAllByCheckID(@Param("checkID")String autoID);

}