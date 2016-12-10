package com.will.app.action;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action
{
	private String username;
	private String password;
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getUsername()
	{
		return this.username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	@Override
	public String execute() throws Exception {
		if(this.username.equals("wangyue")&& this.password.equals("123"))
		{
			return SUCCESS;
		}
		return ERROR;
	}
	
}
