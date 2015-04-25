<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="br.com.agenda.modelo.Contato"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
	
	<table border="1">
		<tr>
			<td><b>Nome Contato</b></td>
			<td><b>Data Nascimento</b></td>
			<td><b>Telefone</b></td>
			<td><b>Tipo Telefone</b></td>
			<td><b>Email</b></td>
			<td><b>Editar</b></td>
			<td><b>Excluir</b></td>
		</tr>
		<c:forEach items="${listaContatos}" var="contato">
			<tr>
				<td>${contato.pessoa.nome}</td>
				<td>${contato.pessoa.dataNascimentoStr}</td>
				<td>${contato.telefone}</td>
				<td>${contato.telefone.tipo.descricao}</td>
				<td>${contato.email}</td>
				<td><a href='/agenda-web/excluir.cmd?comando=br.com.treinar.agenda.negocio.SelecionaContatoCommand&id=${contato.id}'>Editar</a></td>
				<td><a href='/agenda-web/excluir.cmd?comando=br.com.treinar.agenda.negocio.ExcluiContatoCommand&id=${contato.id}'>Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>