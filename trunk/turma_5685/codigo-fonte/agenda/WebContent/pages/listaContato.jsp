<%@ page import="br.com.treinar.agenda.modelo.Contato"%>
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
		<!-- Utilizando JSTL -->
		<table border="1">
			<c:if test="${empty contatos}">
				Nenhum contato
			</c:if>
			<c:forEach var="c" items="${contatos}" varStatus="id">
				<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff'}" >
					<td>${c.nome}</td>
					<td>${c.email}</td>
					<td>${c.telefone.ddd}${c.telefone.numero}</td>
					<td><a href="../pages/editaContato.controle?comando=SelecionaContato&email=${c.email}">Editar</a></td>
					<td><a href="/agenda/pages/excluiContato.controle?comando=ExcluiContato&email=${c.email}">Excluir</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>

</body>
</html>