<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="treinar" uri="../WEB-INF/treinar.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Contatos</title>
</head>
<body>

	<%@ include file="/index.jsp" %>
	
	<br />
	<form action="servletControle.controle" method="post">
		<input type="hidden" name="comando" value="CadastroContato">
		<label for="nome">Nome</label>		
		<input type="text" name="nome"><br /><br />
		<label for="telefone">Telefone</label>	
		<input type="text" name="ddd" size="2">
		<input type="text" name="telefone">
		
		<select id="tipoTelefone" name="tipoTelefone">
			<option value="">Selecione</option>
			<c:forEach var="tipo" items="${tiposTelefone}">
				<option value="${tipo}">${tipo.descricao}</option>
			</c:forEach>
		</select>
		<br /><br />
		<label for="email">Email</label>		
		<input type="text" name="email"><br /><br />	
		<input type="submit" value="Cadastrar"> 
	</form>
	<br />
	<br />
	<div>
		<treinar:msgRodapeh message="Mensagem Rodapé"/>
	</div>

</body>
</html>