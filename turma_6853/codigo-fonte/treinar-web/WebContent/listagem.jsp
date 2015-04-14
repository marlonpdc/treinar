<%@ page import="br.com.treinar.modelo.Pessoa"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pessoas</title>
</head>
<body>


	<table>
	
		<%
					
			List<Pessoa> pessoas = (List<Pessoa>) request.getAttribute("listar");
		
			for(Pessoa pessoa : pessoas) {
				out.print("<tr>");
				out.print("<td>");
				out.print(pessoa.getNome());
				out.print("</td>");
				out.print("<td>");
				out.print(pessoa.getIdade());
				out.print("</td>");
				out.print("</tr>");
			}
		
		%>
	
	</table>
	

</body>
</html>