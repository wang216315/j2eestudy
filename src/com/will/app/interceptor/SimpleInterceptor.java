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
		System.out.println(name + " �������Ķ���------" + "��ʼִ�е�¼Action��ʱ��Ϊ: "+
		new Date());
		//��ʼִ�е�ʱ��
		long start = System.currentTimeMillis();
		
		String result = invocation.invoke();
		
		System.out.println(name + " �������Ķ���------" + " ִ�����¼Action��ʱ��Ϊ:"
		+ new Date());
		
		long end = System.currentTimeMillis();
		
		System.out.println(name + " �������Ķ���--------" + "ִ�����Action��ʱ��Ϊ" +
		(end - start) + "����");		
			
		return result;
	}

}
