/**   
 * Copyright © 2018 Beijing RainXing Technology. Tech Ltd. All rights reserved.
 * 
 * @Package: com.rainxing.app.test 
 * @author: ybzhu   
 * @date: 2018年6月4日 上午10:46:33 
 */
package com.rainxing.app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.rainxing.app.pojo.Customer;
import com.rainxing.app.service.CustomerService;

/**
 * @ClassName: ServiceTest
 * @Description: 单元测试
 * @author: ybzhu
 * @date: 2018年6月4日 上午10:46:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Transactional
public class ServiceTest {
	// 注入service
	@Autowired
	private CustomerService customerService;

	/** 
	* @Title: testIDService 
	* @Description: 通过企业ID查询企业表（Customer）信息 
	* @throws Exception void
	* @author ybzhu
	* @date 2018年6月4日上午11:03:30
	*/ 
	@Test
	public void testIDService() throws Exception {
		Customer customer = customerService.findById("6a632cdf-1aff-4f7e-b3c7-54d1d704e25b");
		System.out.println("企业名称：：" + customer.getCompanyName());
	}
	
}
