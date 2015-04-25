<%@ page import="br.com.agenda.modelo.Contato"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="a" uri="../WEB-INF/agenda.tld"%>
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
	<form action="editar.cmd" method="post">
		<input name="comando" type="hidden" value="br.com.treinar.agenda.negocio.EditaContatoCommand">
		<input name="id" type="hidden" value="${contato.id}">
		
		<table>
			<tr>
				<td>Nome</td>
				<td><input name="nome" type="text" value="${contato.pessoa.nome}"></td>
			</tr>
			<tr>
				<td>Data Nascimento</td>
				<td><input name="dataNascimento" type="text" value="${contato.pessoa.dataNascimentoStr}"></td>
			</tr>
			<tr>
				<td>Telefone</td>
				<td><input name="telefone" type="text" value="${contato.telefone}"></td>
			</tr>
			<tr>
				<td>Tipo Telefone</td>
				<td>
					<a:tipo id="tipo" name="tipo"/>
				</td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td><input name="email" type="text" value="${contato.email}"></td>
			</tr>
		</table>
		<br />
		<br />
		<input type="submit" value="Editar Contato">
	</form>
</body>
</html>