/**   
 * Copyright © 2018 Beijing RainXing Technology. Tech Ltd. All rights reserved.
 * 
 * @Package: com.rainxing.app.service.impl 
 * @author: ybzhu   
 * @date: 2018年6月1日 下午2:22:47 
 */
package com.rainxing.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rainxing.app.mapper.CustomerMapper;
import com.rainxing.app.mapper.CustomerValueMapper;
import com.rainxing.app.pojo.Customer;
import com.rainxing.app.pojo.CustomerValue;
import com.rainxing.app.service.CustomerService;

/** 
 * @ClassName: CustomerServiceImpl 
 * @Description: 企业信息接口实现类
 * @author: ybzhu
 * @date: 2018年6月1日 下午2:22:47  
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	// @Fields customerMapper : 企业信息表  mapper
	@Autowired
	private CustomerMapper customerMapper;
	// @Fields customerValueMapper : 企业信息内容表 mapper
	@Autowired
	private CustomerValueMapper customerValueMapper;
	/**
	 * @Title: findById
	 * @Description: 通过企业ID查询企业信息
	 * @param autoID
	 * @return
	 * @throws Exception 
	 * @see com.rainxing.app.service.CustomerService#findById(java.lang.String) 
	 */ 
	@Override
	public Customer findById(String autoID) throws Exception {
		// TODO Auto-generated method stub
		return customerMapper.selectByPrimaryKey(autoID);
	}

	/**
	 * @Title: getAll
	 * @Description: 全查询所有企业信息
	 * @return
	 * @throws Exception 
	 * @see com.rainxing.app.service.CustomerService#getAll() 
	 */ 
	@Override
	public List<Customer> getAll() throws Exception {
		// TODO Auto-generated method stub
		return customerMapper.getCustomerAll();
	}

	/**
	 * @Title: insert
	 * @Description: 新增企业信息
	 * @param customer
	 * @throws Exception 
	 * @see com.rainxing.app.service.CustomerService#insert(com.rainxing.app.pojo.Customer) 
	 */ 
	@Override
	public void insert(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		customerMapper.insert(customer);
	}

	/**
	 * @Title: delByID
	 * @Description: 删除企业信息
	 * @throws Exception 
	 * @see com.rainxing.app.service.CustomerService#delByID() 
	 */ 
	@Override
	public void delByID(String autoID) throws Exception {
		// TODO Auto-generated method stub
		customerMapper.deleteByPrimaryKey(autoID);
	}

	/**
	 * @Title: findCustomerValueByCid
	 * @Description: 通过企业信息表外键CustomerID查询企业信息（字段） 
	 * @param autoID
	 * @return 
	 * @see com.rainxing.app.service.CustomerService#findCustomerValueByCid(java.lang.String) 
	 */ 
	@Override
	public List<CustomerValue> findCustomerValueByCid(String autoID) {
		// TODO Auto-generated method stub
		return customerValueMapper.getCustomerByCid(autoID);
	}

}
