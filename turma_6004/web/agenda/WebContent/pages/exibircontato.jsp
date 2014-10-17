<%@page import="br.com.treinar.agenda.modelo.Contato"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exibir Contatos</title>
<script type="text/javascript">

	function editar(id) {
		alert(id);
		document.getElementById('idContato').value = id;
	}

</script>

</head>
<body>

	<form action="../agenda">
		<input type="hidden" value="br.com.treinar.agenda.comando.EditaContatoComando" name="comando">
		<input type="hidden" value="" name="id" id="idContato">
		
		Lista de Contatos
		<table border="1">
		<% 
			if(request.getAttribute("contatos") != null) {
				
				List<Contato> contatos = (List<Contato>)request.getAttribute("contatos");
				
				for(Contato c : contatos) {
					out.println("<tr>");
					out.println("<td>");
					out.println(c.getNome());				
					out.println("</td>");
					out.println("<td>");
					out.print(c.getEmail());			
					out.println("</td>");
					out.println("<td>");
					out.print(c.getEndereco());			
					out.println("</td>");
					out.println("<td>");
					out.print(c.getTelefone().getDdd() + "-" + c.getTelefone().getNumero());			
					out.println("</td>");
					out.println("<td>");
					out.print("<a href=\"agenda?id="+c.getId()+"&comando="+"br.com.treinar.agenda.comando.SelecionaContatoComando"+"\" >Editar</a>");		
					out.println("</td>");
					out.println("</tr>");
				}
			}
		%>
		</table>
		<a href="agenda?id=10" >Teste</a>
	</form>

</body>
</html>