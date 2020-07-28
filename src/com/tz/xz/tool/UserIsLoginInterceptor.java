package com.tz.xz.tool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tz.xz.pojo.TbUserInfo;

public class UserIsLoginInterceptor implements HandlerInterceptor {

	//页面之后调用的方法
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("页面渲染");
	}

	//controller方法执行完成之后调用的方法
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("方法后进来了");
		
	}
	
	//controller方法前调用的方法，所以拦截类主要的操作写在这个方法里面
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("方法前进来了");
		TbUserInfo user = (TbUserInfo)request.getSession().getAttribute("USER");
		if(user == null){//未登陆
			//未登录就跳到登录页面
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			//不放行
			return false;
		}
		//代表用户已经登陆，可以放行
		return true;
	}

}
