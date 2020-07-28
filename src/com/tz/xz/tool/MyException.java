package com.tz.xz.tool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyException implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request, 
			HttpServletResponse response, Object obj,
			Exception ex) {
		ModelAndView  mv=new ModelAndView();
		//出现异常时显示的视图
		mv.setViewName("myexception");
		//ex是一个键，保存的是返回给页面的信息
		mv.addObject("ex", "系统异常，请联系管理员！"+ex.getMessage());
		return mv;
	}

}
