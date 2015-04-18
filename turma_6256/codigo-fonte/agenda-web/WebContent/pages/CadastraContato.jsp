<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<jsp:include page="/index.jsp"/>
	<br />
	<br />
	<br />
	<%=request.getAttribute("testeArquitetura") %>
</body>
</html>