<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.treinar.agenda.modelo.Contato" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Contato</title>
</head>
<body>
	<%@ include file="/index.jsp" %>
	
	<br />
	<form action="servletControle.controle" method="post">
		<input type="hidden" name="comando" value="EditaContato">
		<input type="hidden" name="contato" value="${contato.email}">
		<label for="nome">Nome</label>		
		<input type="text" value="${contato.nome}" name="nome"><br /><br />
		<label for="telefone">Telefone</label>	
		<input type="text" value="${contato.telefone.ddd}" name="ddd">
		<input type="text" value="${contato.telefone.numero}" name="telefone">
		
		<select id="tipoTelefone" name="tipoTelefone">
			<option value="-1">Selecione</option>
			<c:forEach var="tipo" items="${tiposTelefone}">
				<option value="${tipo}" ${contato.telefone.tipo == tipo ? 'selected' : ''}>
					${tipo.descricao}
				</option>
			</c:forEach>
		</select>
		
		<br /><br />
		<label for="email">Email</label>		
		<input type="text" value="${contato.email}" name="email"><br /><br />	
		<input type="submit" value="Editar"> 
	</form>
</body>
</html>