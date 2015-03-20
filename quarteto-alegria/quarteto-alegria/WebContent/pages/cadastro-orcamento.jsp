<%@page import="br.com.quartetoalegreto.orcamento.modelo.Orcamento"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Orçamento</title>
</head>
<body>

	<form action="cadastroOrcamento.qal" method="post">
		<table border="1">
			<tr>
				<td>Cliente</td>
				<td>Endereco</td>
				<td>Inicio</td>
				<td>Termino</td>
			</tr>
			<%
				List<Orcamento> orcamentos = (List<Orcamento>) request.getAttribute("orcamentos");
				for(int i = 0; i < orcamentos.size(); i++) {
					out.println("<tr>");
					out.println("<td>" + orcamentos.get(i).getCliente().getNome() + "</td>");
					out.println("<td>" + orcamentos.get(i).getCliente().getEndereco() + "</td>");
					out.println("<td>" + orcamentos.get(i).getEvento().getDataInicio() + "</td>");
					out.println("<td>" + orcamentos.get(i).getEvento().getDataTermino() + "</td>");
					out.println("</tr>");
				}
			
			%>
		</table>
		
		
		<br />		
		<input type="submit" value="Enviar Orçamento">
	</form>

</body>
</html>