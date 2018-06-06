/**   
 * Copyright © 2018 Beijing RainXing Technology. Tech Ltd. All rights reserved.
 * 
 * @Package: com.rainxing.app.test 
 * @author: ybzhu   
 * @date: 2018年6月1日 下午2:27:07 
 */
package com.rainxing.app.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.rainxing.app.mapper.CustomerMapper;
import com.rainxing.app.pojo.Customer;
import com.rainxing.app.utils.JsonUtils;

/** 
 * @ClassName: AppTest 
 * @Description: 测试类(只测试mapper)
 * @author: ybzhu
 * @date: 2018年6月1日 下午2:27:07  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Transactional
public class MapperTest {
	
	//注入mapper
	@Autowired
	private CustomerMapper customerMapper;
	//注入CustomerMapper
//	@Autowired
//	private CheckValueMapper checkValueMapper;
	
	/** 
	* @Title: testAddMapper 
	* @Description: 新增一个 
	* @throws Exception void
	* @author ybzhu
	* @date 2018年6月1日下午2:52:15
	*/ 
	@Test
	public void testAddMapper() throws Exception {
		Customer customer=new Customer();
		customer.setAutoID("6");
		customer.setCompanyName("企业六");
		int a= customerMapper.insert(customer);
		if(a==1){
			System.out.println("添加成功！！！");
		}else{
			System.out.println("添加失败！！！");
		}
		
	}
	/** 
	* @Title: testMapper 
	* @Description: 通过ID单个查询
	* @throws Exception void
	* @author ybzhu
	* @date 2018年6月1日下午2:44:41
	*/ 
	@Test
	public void testIDMapper() throws Exception {
		Customer list = customerMapper.selectByPrimaryKey("6a632cdf-1aff-4f7e-b3c7-54d1d704e25b");
		System.out.println("企业名称：：" + list.getCompanyName());
	}
	/** 
	* @Title: testAllMapper 
	* @Description: 查询所有 并转换为json格式数据
	* @throws Exception void
	* @author ybzhu
	* @date 2018年6月1日下午2:47:15
	*/ 
	@Test
	public void testAllMapper() throws Exception {
		List<Customer> list = customerMapper.getCustomerAll();
		String objectToJson = JsonUtils.objectToJson(list);
		System.out.println("json数据：：" + objectToJson);
	}
	
}
