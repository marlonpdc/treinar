<%@ page import="br.com.treinar.servlet.Pessoa"%>
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
		<br />Matricula:&#160;
		<input type="text" name="matricula">
	
		<br />
		<br />
		
		<label for="name">Nome:&nbsp;</label>
		<br />
		<br />
		<label for="funcao">Função:&nbsp;</label>
		<input type="text" id="funcao" name="funcao">
		
		<br />
		<br />
		
		<% 
			if(request.getAttribute("pessoa") != null) {
				out.print("Olá: ");
				out.print(((Pessoa)request.getAttribute("pessoa")).getNome()); 
			}
			out.print("<br />");
			if(request.getSession().getAttribute("cont") != null) {
				out.print("Cont: ");
				out.print(request.getSession().getAttribute("cont")); 
			}
		%>
		<br />
		<br />
		

		<input type="submit" value="Enviar">
		
	</form>


</body>
</html>