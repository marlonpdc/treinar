
<%@page import="br.com.treinar.agenda.modelo.Contato"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Contatos</title>
</head>
<body>
	<%@ include file="/index.jsp" %>
	<br />
	<form action="servletControle.controle" method="post">
		<input type="hidden" name="comando" value="ListaContato">
		<br />
		<br />
			
			<%
				List<Contato> contatos = (List<Contato>) request.getAttribute("contatos");
				if (contatos != null) {
					out.write("<table border=\"1\">");
					for(Contato c : contatos) {
						out.write("<tr>");
						
						out.write("<td>");
						out.write(c.getNome());
						out.write("</td>");
						out.write("<td>");
						out.write(c.getTelefone().getDdd() + "" + c.getTelefone().getNumero());
						out.write("</td>");
						out.write("<td>");
						out.write(c.getEmail());
						out.write("</td>");
						
						out.write("</tr>");
						
					}
					out.write("</table>");
				}
			%>
		
	</form>

</body>
</html>