/**   
 * Copyright © 2018 Beijing RainXing Technology. Tech Ltd. All rights reserved.
 * 
 * @Package: com.rainxing.app.service 
 * @author: ybzhu   
 * @date: 2018年6月1日 下午2:21:31 
 */
package com.rainxing.app.service;

import java.util.List;

import com.rainxing.app.pojo.Customer;
import com.rainxing.app.pojo.CustomerValue;

/** 
 * @ClassName: CustomerService 
 * @Description: 企业信息service接口
 * @author: ybzhu
 * @date: 2018年6月1日 下午2:21:31  
 */
public interface CustomerService {

	//通过企业ID查询企业信息
	Customer findById(String autoID) throws Exception;
	//全查询所有企业信息
	List<Customer> getAll() throws Exception;
	//新增企业信息
	void insert(Customer customer) throws Exception;
	//删除企业信息
	void delByID(String autoID) throws Exception;
	/** 
	* @Title: findCustomerValueByCid 
	* @Description: 通过企业信息表外键CustomerID查询企业信息（字段）  
	* @param autoID
	* @return List<CustomerValue>
	* @author ybzhu
	* @date 2018年6月4日下午5:12:16
	*/ 
	List<CustomerValue> findCustomerValueByCid(String autoID);
}
