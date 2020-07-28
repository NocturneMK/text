package com.tz.xz.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tz.xz.pojo.TbUserInfo;
import com.tz.xz.service.UserService;
/**
 * 登录，演示前端通过Ajax传数据
 * @author Nocturne
 * 
 * 测试：在浏览器上输入http://localhost:8080/SSMdemo，点击登录，输入user、pwd
 */

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login.action")
	//返回的数据类型要加上注解@ResponseBody，因为此处返回的是数据，如果不加这个注解就会返回一个视图（Controller返回值类型1、ModelAndView类型   2、String类型）
	public @ResponseBody TbUserInfo login(String username, String pwd, HttpSession session) {//使用Ajax方式，json格式数据，所以此处形参名要和data:{"username":name,"pwd":pwd}一致
		System.out.println("===="+username);
		
		TbUserInfo userInfo=userService.selectUserInfo(username,pwd);
		//登陆成功，把用户对象保存到session当中
		if(userInfo!=null){
			session.setAttribute("USER", userInfo);
		}
		
		return userInfo;
	}
}


/*
@RequestBody
作用：
@RequestBody注解用于读取http请求的内容(字符串)，通过springmvc提供的HttpMessageConverter接口将读到的内容转换为json、xml等格式的数据并绑定到controller方法的参数上。

本例子应用：
@RequestBody注解实现接收http请求的json数据，将json数据转换为java对象

@ResponseBody
作用：
该注解用于将Controller的方法返回的对象，通过HttpMessageConverter接口转换为指定格式的数据如：json,xml等，通过Response响应给客户端

本例子应用：
@ResponseBody注解实现将controller方法返回对象转换为json响应给客户端
 
*/
