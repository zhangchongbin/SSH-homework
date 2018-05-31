<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>用户注册</title>
	</head>

	<body>
		<s:form action="login">
			<s:textfield key="用户名" name="username" />
			<s:password key="密码" name="pwd" />
			<s:submit value="提 交" />
		</s:form>
	</body>
</html>