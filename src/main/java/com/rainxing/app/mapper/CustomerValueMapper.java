package com.rainxing.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rainxing.app.pojo.CustomerValue;

public interface CustomerValueMapper {
    int deleteByPrimaryKey(String autoID);

    int insert(CustomerValue record);

    int insertSelective(CustomerValue record);

    CustomerValue selectByPrimaryKey(String autoID);
    
    List<CustomerValue> getCustomerByCid(@Param("CustomerID") String autoID);

    int updateByPrimaryKeySelective(CustomerValue record);

    int updateByPrimaryKey(CustomerValue record);
}