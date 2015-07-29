<%@ page import="br.com.treinar.agenda.TipoTelefone"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="ag" uri="../WEB-INF/agenda.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Criar Contato</title>
</head>
<body>
	<c:if test="${erro != ''}">
		<h1>${erro}</h1>
	</c:if>
	<form id="form-1" action="li.cmd">
		
		<div style="width: 60%; margin: 0;">
			<input id="comando" name="comando" type="hidden" value="1">

			<table data-role="table" id="table-1" class="ui-responsive">
				<thead>
					<tr>
						<th data-priority="1">Indice</th>
						<th data-priority="2">Nome</th>
						<th data-priority="3">Telefone</th>
						<th data-priority="4">Tipo</th>
						<th data-priority="4">Excluir</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${contatos}" 
								var="contato"
								varStatus="status">
						<tr>
							<td>${status.index}</td>
							<td>${contato.pessoa.nome}</td>
							<td>
								(${contato.telefones[0].ddd}) 
								${contato.telefones[0].numero}
							</td>
							<td>${contato.telefones[0].tipoTelefone.descricao}</td>
							<td><a href="/agenda-web/remove.cmd?nomePessoa=${contato.pessoa.nome}">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>

	</form>

</body>
</html>