package com.lp.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lp.springcloud.entities.Dept;
import com.lp.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

//@RestController注解，相当于@Controller+@ResponseBody两个注解的结合，返回json数据不需要在方法前面加@ResponseBody注解了，但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
@RestController
public class DeptController {

	@Autowired
	public DeptService deptService;

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	// 一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
	@HystrixCommand(fallbackMethod = "getException_Hystrix")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = deptService.get(id);
		if (dept == null) {
			throw new RuntimeException("无此id信息");
		}
		return dept;
	}

	public Dept getException_Hystrix(@PathVariable("id") Long id) {
		Dept dept = new Dept();
		return dept.setDname("没有此id").setDbsource("此数据库没有此记录---@HystrixCommand");
	}
}
