/**   
 * Copyright © 2018 Beijing RainXing Technology. Tech Ltd. All rights reserved.
 * 
 * @Package: com.rainxing.app.controller 
 * @author: ybzhu   
 * @date: 2018年6月1日 下午2:25:54 
 */
package com.rainxing.app.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rainxing.app.pojo.CheckValue;
import com.rainxing.app.pojo.Checks;
import com.rainxing.app.pojo.Customer;
import com.rainxing.app.pojo.CustomerValue;
import com.rainxing.app.service.CheckValueService;
import com.rainxing.app.service.CustomerService;
import com.rainxing.app.utils.JsonUtils;

/**
 * @ClassName: CustomerController
 * @Description: 企业信息 控制器
 * @author: ybzhu
 * @date: 2018年6月1日 下午2:25:54
 */
@Controller
public class CustomerController {
	private static Logger logger = Logger.getLogger("my.logger.SocketHandlerTest");
	@Autowired
	private CustomerService customerService;
	@Autowired
	private CheckValueService checkValueService;

	/**
	 * @Title: findById
	 * @Description: 通过企业ID主键查询企业信息
	 * @return
	 * @throws Exception
	 *             String
	 * @author ybzhu
	 * @date 2018年6月1日下午4:15:57
	 */
	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String findByCustomerId(@PathVariable("id") String autoID) throws Exception {
		logger.info("要查看的ID是：" + autoID);
		Customer findById = customerService.findById(autoID);
		String json = JsonUtils.objectToJson(findById);
		return json;
	}

	/**
	 * @Title: findByCustomerValueId
	 * @Description: 通过企业信息表外键CustomerID查询企业信息（字段）
	 * @param autoID
	 * @return
	 * @throws Exception
	 *             String
	 * @author ybzhu
	 * @date 2018年6月4日下午5:13:12
	 */
	@RequestMapping(value = "/customerValue/{cid}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String findByCustomerValueId(@PathVariable("cid") String autoID) throws Exception {
		logger.info("要查看的企业表外键ID是：" + autoID);
		List<CustomerValue> list = customerService.findCustomerValueByCid(autoID);
		String json = JsonUtils.objectToJson(list);
		return json;
	}

	/**
	 * @Title: findByCheckValueId
	 * @Description: 通过检查表外键ID（企业表主键）查询检查表信息
	 * @param autoID
	 * @return
	 * @throws Exception
	 *             String
	 * @author ybzhu
	 * @date 2018年6月1日下午5:57:01
	 */
	@RequestMapping(value = "/checkValue/{cid}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String findByCheckValueId(@PathVariable("cid") String autoID) throws Exception {
		logger.info("要查看的ID是：" + autoID);
		List<CheckValue> list = checkValueService.getAllByID(autoID);
		String json = JsonUtils.objectToJson(list);
		return json;
	}
	/** 
	* @Title: findByCheckValueCheckId 
	* @Description: 通过检查表外键CheckID（检查表主键）查询检查表信息 
	* @param autoID
	* @return
	* @throws Exception String
	* @author ybzhu
	* @date 2018年6月5日上午10:26:39
	*/ 
	@RequestMapping(value = "/checkValueByCheckId/{checkid}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String findByCheckValueCheckId(@PathVariable("checkid") String autoID) throws Exception {
		logger.info("要查看的ID是：" + autoID);
		List<CheckValue> list = checkValueService.getAllByCheckID(autoID);
		String json = JsonUtils.objectToJson(list);
		return json;
	}

	/**
	 * @Title: findByCheckId
	 * @Description: 通过检查详细表主键ID查询一条检查表详细信息
	 * @param autoID
	 * @return
	 * @throws Exception
	 *             String
	 * @author ybzhu
	 * @date 2018年6月1日下午5:54:56
	 */
	@RequestMapping(value = "/check/{cid}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String findByCheckId(@PathVariable("cid") String autoID) throws Exception {
		logger.info("要查看的ID是：" + autoID);
		CheckValue checkValue = checkValueService.findByID(autoID);
		String json = JsonUtils.objectToJson(checkValue);
		return json;
	}
	

	/**
	 * @Title: findByCheckName
	 * @Description: 通过企业名字查询检查表数据
	 * @param cname
	 * @return
	 * @throws Exception
	 *             String
	 * @author ybzhu
	 * @date 2018年6月4日下午6:17:28
	 */
	@RequestMapping(value = "/checksName/{cname}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String findByCheckName(@PathVariable("cname") String cname) throws Exception {
		logger.info("要查看的名字是：" + cname);
		List<CheckValue> checkValue = checkValueService.findByName(cname);
		String json = JsonUtils.objectToJson(checkValue);
		return json;
	}

	/**
	 * @Title: findByChecksId
	 * @Description: 通过检查表主键checkID作为主键查询检查表信息
	 * @param autoID
	 * @return
	 * @throws Exception
	 *             String
	 * @author ybzhu
	 * @date 2018年6月4日下午6:04:34
	 */
	@RequestMapping(value = "/checksId/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String findByChecksId(@PathVariable("id") String autoID) throws Exception {
		logger.info("要查看的检查表主键ID是：" + autoID);
		Checks checkValue = checkValueService.findByChecksID(autoID);
		String json = JsonUtils.objectToJson(checkValue);
		return json;
	}

	/**
	 * @Title: addCheck
	 * @Description: 新增检查表信息(自填)
	 * @param checkValue
	 * @return
	 * @throws Exception
	 *             String
	 * @author ybzhu
	 * @date 2018年6月4日下午5:32:43
	 */
	@RequestMapping(value = "/check", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String addCheck(@PathVariable("cid") CheckValue checkValue) throws Exception {
		logger.info("要查看的实体是：" + checkValue);
		int i = checkValueService.insert(checkValue);
		if (i > 0) {
			return "添加成功";
		} else {
			return "添加失败";
		}
	}
}
