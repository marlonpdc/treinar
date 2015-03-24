<%@page import="br.com.quartetoalegreto.orcamento.modelo.StatusOrcamento"%>
<%@page import="br.com.quartetoalegreto.orcamento.modelo.Orcamento"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
				<td>Situação</td>
			</tr>
			<c:forEach items="${orcamentos}" var="orcamento">
				<tr>
					<td>${orcamento.cliente.nome}</td>
					<td>${orcamento.cliente.endereco}</td>
					<td>${orcamento.evento.dataInicio}</td>
					<td>${orcamento.evento.dataTermino}</td>
					<td>
						<select id="status" name="status">
							<option value="-1">Selecione</option>
							<c:forEach items="${statusOrcamento}" var="status">
								<option value="status" ${status == orcamento.status ? 'selected' : ''}>${status.descricao}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
			</c:forEach>
		</table>
		
		
		<br />		
		<input type="submit" value="Enviar Orçamento">
	</form>

</body>
</html>