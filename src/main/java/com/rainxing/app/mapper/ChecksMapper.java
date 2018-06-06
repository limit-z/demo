package com.rainxing.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rainxing.app.pojo.CheckValue;
import com.rainxing.app.pojo.Checks;

public interface ChecksMapper {
    int insert(Checks record);

    int insertSelective(Checks record);
    
    Checks selectByPrimaryKey(String autoID);

	/** 
	* @Title: findByName 
	* @Description: 通过企业名字查询检查表数据  
	* @param cname
	* @return List<CheckValue>
	* @author ybzhu
	* @date 2018年6月4日下午6:22:51
	*/ 
	List<CheckValue> findByName(@Param("cname") String cname);

}