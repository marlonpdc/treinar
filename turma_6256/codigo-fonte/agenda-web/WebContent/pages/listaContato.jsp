<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@ page import="br.com.agenda.modelo.Contato"%>
<%@ page import="java.util.List"%>
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
	<table border="1">
		<%
			List<Contato> contatos = (List<Contato>) request.getAttribute("listaContatos");
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
			if (contatos != null)  {
				out.println("<tr>");
				out.println("<td>");
				out.println("<b>Nome</b>");
				out.println("</td>");				
				out.println("<td>");
				out.println("<b>Data Nascimento</b>");
				out.println("</td>");				
				out.println("<td>");
				out.println("<b>Telefone</b>");
				out.println("</td>");				
				out.println("<td>");
				out.println("<b>Email</b>");
				out.println("</td>");
				out.println("<td>");
				out.println("<b>Excluir</b>");
				out.println("</td>");	
				out.println("</tr>");
				
				for(Contato contato : contatos) {
					out.println("<tr>");
					out.println("<td>");
					out.println(contato.getPessoa().getNome());
					out.println("</td>");				
					out.println("<td>");
					out.println(df.format(contato.getPessoa().getDataNascimento()));
					out.println("</td>");				
					out.println("<td>");
					out.println("(" +contato.getTelefone().getDdd() + ") " + contato.getTelefone().getNumero());
					out.println("</td>");				
					out.println("<td>");
					out.println(contato.getEmail());
					out.println("</td>");				
					out.println("<td>");
					out.println("<a href='/agenda-web/excluir.cmd?comando=br.com.treinar.agenda.negocio.ExcluiContatoCommand&id=" + contato.getId() + "'>Excluir</a>");
					out.println("</td>");	
					out.println("</tr>");
				}
			}
					
		%>
	</table>
</body>
</html>