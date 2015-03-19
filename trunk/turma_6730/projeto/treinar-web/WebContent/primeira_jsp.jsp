<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	Olá web!

	<form action="gleidson" method="get">
	
		<input type="checkbox" name="campo" value="Campo Um">
		<input type="checkbox" name="campo" value="Campo Dois">
		<input type="checkbox" name="campo" value="Campo Tres">
		<input type="checkbox" name="campo" value="Campo Quatro">
		<input type="checkbox" name="campo" value="Campo Cinco">
		<input type="checkbox" name="campo" value="Campo Seis">
		<input type="checkbox" name="campo" value="Campo Sete">
	
		<br />
		<br />
		
		<label for="name">Nome:&nbsp;</label>
		<input type="text" id="nome" name="nome">
		<br />
		<br />
		<label for="funcao">Função:&nbsp;</label>
		<input type="text" id="funcao" name="funcao">
		
		<br />
		<br />
		Olá <% out.print(request.getAttribute("nome")); %> &nbsp; <% out.print(request.getAttribute("funcao")); %>
		<br />
		<br />
		

		<input type="submit" value="Enviar">
		
	</form>


</body>
</html>