<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.treinar.agenda.modelo.Contato" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Contato</title>
</head>
<body>
	<%@ include file="/index.jsp" %>
	
	<br />
	<form action="servletControle.controle" method="post">
		<input type="hidden" name="comando" value="CadastroContato">
		<label for="nome">Nome</label>		
		<input type="text" value="${contato.nome}" name="nome"><br /><br />
		<label for="telefone">Telefone</label>	
		<input type="text" name="ddd">
		<input type="text" name="telefone"><br /><br />
		<label for="email">Email</label>		
		<input type="text" name="email"><br /><br />	
		<input type="submit" value="Cadastrar"> 
	</form>
</body>
</html>