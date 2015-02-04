<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="login.cmd">
		<input type="hidden" value="br.com.treinar.service.LoginService" name="comando" />
		Login
		<input type="text" name="login">
		<br />
		<br />
		Senha
		<input type="password" name="senha">
		<br />
		<br />
		<input type="submit" value="Logar">		
	</form>
<jsp:include page="/pages/home/rodape.jsp" />



</body>
</html>