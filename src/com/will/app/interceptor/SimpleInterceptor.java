package com.will.app.interceptor;

import java.util.Date;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.will.app.action.*;

public class SimpleInterceptor extends AbstractInterceptor
{

	private String name;
	
	private void SetName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception 
	{
		LoginAction action = (LoginAction)invocation.getAction();
		System.out.println(name + " 拦截器的动作------" + "开始执行登录Action的时间为: "+
		new Date());
		//开始执行的时间
		long start = System.currentTimeMillis();
		
		String result = invocation.invoke();
		
		System.out.println(name + " 拦截器的动作------" + " 执行完登录Action的时间为:"
		+ new Date());
		
		long end = System.currentTimeMillis();
		
		System.out.println(name + " 拦截器的动作--------" + "执行完该Action的时间为" +
		(end - start) + "毫秒");		
			
		return result;
	}

}
