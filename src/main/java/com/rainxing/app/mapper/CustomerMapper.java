package com.rainxing.app.mapper;

import java.util.List;

import com.rainxing.app.pojo.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(String autoID);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String autoID);
    
    List<Customer> getCustomerAll();

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}