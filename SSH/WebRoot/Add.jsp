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
    
    <title>My JSP 'Add.jsp' starting page</title>
    
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
  	<s:form action="addinfo!insert.action">
    	<s:textfield name="student.name" label="姓名" value=""></s:textfield><br>
    	<s:textfield name="student.sex" label="性别" value=""></s:textfield><br>
    	<s:textfield name="student.age" label="年龄" value=""></s:textfield><br>
    	<s:submit value="提交"></s:submit>
    	<s:reset value="重置"></s:reset>
    </s:form>
    <s:fielderror></s:fielderror>
  </body>
</html>
