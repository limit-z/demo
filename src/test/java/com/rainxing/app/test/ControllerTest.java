/**   
 * Copyright © 2018 Beijing RainXing Technology. Tech Ltd. All rights reserved.
 * 
 * @Package: com.rainxing.app.test 
 * @author: ybzhu   
 * @date: 2018年6月4日 上午11:05:35 
 */
package com.rainxing.app.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import com.rainxing.app.controller.CustomerController;

/**
 * @ClassName: ControllerTest
 * @Description: controller 单元测试
 * @author: ybzhu
 * @date: 2018年6月4日 上午11:05:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc/springMvc.xml"})
@Transactional
public class ControllerTest {

	@Autowired
	private CustomerController customerController;
	// Controller测试类
	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(customerController).build();
	}

	/** 
	* @Title: findByCustomerValueId 
	* @Description: 通过企业信息表外键CustomerID查询企业信息（字段） 
	* @throws Exception void
	* @author ybzhu
	* @date 2018年6月4日下午5:28:41
	*/ 
	@Test
	public void findByCustomerValueId() throws Exception {
		ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get("/customerValue/6a632cdf-1aff-4f7e-b3c7-54d1d704e25b").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("cid", "6a632cdf-1aff-4f7e-b3c7-54d1d704e25b"));
		MvcResult mvcResult = resultActions.andReturn();
		String result = mvcResult.getResponse().getContentAsString();
		System.out.println("=====客户端获得反馈数据=====" + result);
		// 也可以从response里面取状态码，header,cookies...
		// System.out.println(mvcResult.getResponse().getStatus());
	}
	
	/** 
	* @Title: findByCustomerId 
	* @Description: get传参获取 通过主键ID查询企业信息
	* @throws Exception void
	* @author ybzhu
	* @date 2018年6月4日下午2:21:50
	*/ 
	@Test
	public void findByCustomerId() throws Exception {
		ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get("/customer/6a632cdf-1aff-4f7e-b3c7-54d1d704e25b").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("id", "6a632cdf-1aff-4f7e-b3c7-54d1d704e25b"));
		MvcResult mvcResult = resultActions.andReturn();
		String result = mvcResult.getResponse().getContentAsString();
		System.out.println("=====客户端获得反馈数据=====" + result);
		// 也可以从response里面取状态码，header,cookies...
		// System.out.println(mvcResult.getResponse().getStatus());
	}
	/** 
	* @Title: findByCheckValueId 
	* @Description: 通过检查表外键ID（企业表主键）查询检查表信息
	* @throws Exception void
	* @author ybzhu
	* @date 2018年6月4日下午2:42:38
	*/ 
	@Test
	public void findByCheckValueId() throws Exception {
		ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get("/checkValue/6a632cdf-1aff-4f7e-b3c7-54d1d704e25b").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("cid", "6a632cdf-1aff-4f7e-b3c7-54d1d704e25b"));
		MvcResult mvcResult = resultActions.andReturn();
		String result = mvcResult.getResponse().getContentAsString();
		System.out.println("=====客户端获得反馈数据=====" + result);
		// 也可以从response里面取状态码，header,cookies...
		// System.out.println(mvcResult.getResponse().getStatus());
	}
	/** 
	* @Title: findByCheckId 
	* @Description: 通过检查表主键ID查询检查表详细信息 
	* @throws Exception void
	* @author ybzhu
	* @date 2018年6月4日下午5:27:09
	*/ 
	@Test
	public void findByCheckId() throws Exception {
		ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get("/check/01472ba1-d4f3-4916-8c85-989394626140").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("cid", "01472ba1-d4f3-4916-8c85-989394626140"));
		MvcResult mvcResult = resultActions.andReturn();
		String result = mvcResult.getResponse().getContentAsString();
		System.out.println("=====客户端获得反馈数据=====" + result);
		// 也可以从response里面取状态码，header,cookies...
		// System.out.println(mvcResult.getResponse().getStatus());
	}
	@Test
	public void findByCheckName() throws Exception {
		ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get("/checksName/北京天堂岛餐饮有限公司").contentType(MediaType.APPLICATION_FORM_URLENCODED).param("cname", "北京天堂岛餐饮有限公司"));
		MvcResult mvcResult = resultActions.andReturn();
		String result = mvcResult.getResponse().getContentAsString();
		System.out.println("=====客户端获得反馈数据=====" + result);
		// 也可以从response里面取状态码，header,cookies...
		// System.out.println(mvcResult.getResponse().getStatus());
	}
}
