<%@page import="br.com.treinar.modelo.TipoTelefone"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="trn" uri="/WEB-INF/treinar.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Contatos</title>
</head>
<body>

	
	<form action="cadastro.cmd">
	
		<input type="hidden" value="br.com.treinar.service.GravarContato" name="comando" />
		
		<div class="ui-field-contain">
			Nome: <input type="text" name="nome">
		</div>
		<div class="ui-field-contain">
			Email: <input type="text" name="email">	
		</div>
		<div class="ui-field-contain">
			Telefone: <input type="text" name="telefone">
		</div>
		<div class="ui-field-contain">
			<label for="tipoTelefone">Tipo Telefone:</label>
<%-- 			<trn:tipoTelefone id="tipoTelefone" name="tipoTelefone" /> --%>
			
		<select id="tipoTelefone" name="tipoTelefone">
			<option value="">Selecione</option>
			<c:forEach var="tipoTelefone" items="${tiposTelefone}">
				<c:if test="${tipoTelefone.descricao != 'Recado'}">
					<option value="${tipoTelefone}">${tipoTelefone.descricao}</option>
				</c:if>
			</c:forEach>
		</select>
			
			
		</div>
		<div class="ui-field-contain">
			Endereço: <input type="text" name="endereco"><br />
		</div>
		<div class="ui-field-contain">
			<input type="submit" value="Gravar Contato">
		</div>
	
	</form>
<jsp:include page="/pages/home/rodape.jsp" />
</body>
</html>