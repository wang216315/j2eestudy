<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
</head>
<body>
<h3>用户登陆</h3>
<s:form action="login">
	<s:textfield name="username" label="用户名" />
	<s:password name="password" label="密码" />
	<s:submit value="登陆" />
</s:form>
</body>
</html>