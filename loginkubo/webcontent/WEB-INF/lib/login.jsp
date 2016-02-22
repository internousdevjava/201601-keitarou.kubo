<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="ja">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login</title>
</head>
<body>

	<s:form action="LoginAction">

			<p>ID:<s:textfield name="id"/></p>


			<p>Password:<s:password name="password"/></p>

		<s:submit value="ログイン" />

	</s:form>


</body>
</html>