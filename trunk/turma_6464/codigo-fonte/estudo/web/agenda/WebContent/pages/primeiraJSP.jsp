<%@page import="java.util.List"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Primeira JSP</title>
</head>
<body>

<span>Minha primeira JSP <%= request.getParameter("dia") %></span>


	<% 
		//posso criar codigo aqui dentro
		out.println("<br />");
		List<String> nomes = (List<String>) request.getAttribute("listaNomes");
		for(int i = 0; i < nomes.size(); i++) {
			out.println();
			out.println(" ");
			out.println(nomes.get(i));
			out.println("<br />");
		}
		
	%>
	
	<%!
		//posso declarar variaveis com escopo global, esta por exemplo foi utilizada no bloco de codigo a cima
		String nome = "Gleidson Moura";
	%>

	<%= "".equals("") ? new Date() : "Date" %>


</body>
</html>