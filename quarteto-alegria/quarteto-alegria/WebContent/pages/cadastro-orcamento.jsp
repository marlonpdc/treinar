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
		<input name="comando" type="hidden" value="br.com.quartetoalegreto.orcamento.controle.OrcamentoCommand">
		
		<label for="nomeCliente">Nome:&#160;</label>
		<input name="nomeCliente">
		<br />
		<label for="telefone">Telefone:&#160;</label>
		<input name="telefone">
		<br />		
		<label for="email">Email:&#160;</label>
		<input name="email">
		<br />	
		<label for="enderecoEvento">Endereço do Evento:&#160;</label>
		<input name="enderecoEvento">
		<br />		
		<label for="inicioEvento">Data e Hora do Evento:&#160;</label>
		<input name="inicioEvento">
		<br />		
		<label for="terminoEvento">Date e HOra de término do Evento:&#160;</label>
		<input name="terminoEvento">
		<br />		
		<input type="submit" value="Enviar Orçamento">
	</form>

</body>
</html>