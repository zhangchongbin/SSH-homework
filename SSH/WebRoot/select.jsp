<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  	
  <body>
  <table border="1">
  	<tr><th>Name</th><th>Age</th><th>Sex</th><th>操作</th><th>操作</th></tr>
  	<s:iterator value="list" status="li">
  	<tr>
		<td><s:property value="name"/></td>
		<td><s:property value="age"/></td>
		<td><s:property value="sex"/></td>
	</tr>
	</s:iterator>
</table>
<a href="select!add.action">添加信息</a>
<a href="select!delete.action">删除信息</a>
<a href="select!update.action">修改信息</a>
  </body>
</html>
