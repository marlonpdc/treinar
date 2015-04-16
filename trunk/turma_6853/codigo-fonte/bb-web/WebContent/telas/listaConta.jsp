<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="bb" uri="../WEB-INF/bb.tld"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Contas</title>
</head>
<body>

	<div>
		<jsp:include page="/telas/menu.jsp"/>
	</div>
	<form action="listaConta.bb">
		
		<table border="1">
			<tr>
				<td>Cliente</td>
				<td>CPF</td>
				<td>Status</td>
				<td>Movimentar</td>
			</tr>
			<c:forEach items="${contas}" var="conta">
				<tr>
					<td>${conta.cliente.nome}</td>
					<td>${conta.cliente.cpf}</td>
					<td><bb:status id="status" name="status" /></td>
					<td><a href="lista.bb?comando=br.com.treinar.bb.command.MovimentarContaComando?conta=${conta.id}">Movimentar</a></td>
				</tr>
			</c:forEach>
		</table>
		
	
	</form>



</body>
</html>