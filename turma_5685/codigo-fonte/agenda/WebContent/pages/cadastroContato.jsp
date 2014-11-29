<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Contatos</title>
</head>
<body>

	<%@include file="/index.html" %>
	<br />
	<form action="servletControle.controle" method="post">
		<input type="hidden" name="comando" value="CadastroContato">
		<label for="nome">Nome</label>		
		<input type="text" name="nome"><br /><br />
		<label for="telefone">Telefone</label>		
		<input type="text" name="telefone"><br /><br />
		<label for="email">Email</label>		
		<input type="text" name="email"><br /><br />	
		<input type="submit" value="Cadastrar"> 
	</form>


</body>
</html>