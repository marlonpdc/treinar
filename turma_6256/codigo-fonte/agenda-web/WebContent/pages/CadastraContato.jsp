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
	<form action="cadastrar.cmd" method="post">
		<input name="comando" type="hidden" value="br.com.treinar.agenda.negocio.CadastraContatoCommand">
		<table>
			<tr>
				<td>Nome</td>
				<td><input name="nome" type="text"></td>
			</tr>
			<tr>
				<td>Data Nascimento</td>
				<td><input name="dataNascimento" type="text"></td>
			</tr>
			<tr>
				<td>Telefone</td>
				<td><input name="telefone" type="text"></td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td><input name="email" type="text"></td>
			</tr>
		</table>
		<br />
		<br />
		<input type="submit" value="Gravar Contato">
	</form>
</body>
</html>