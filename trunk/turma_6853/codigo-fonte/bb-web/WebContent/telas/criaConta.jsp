<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Conta</title>
</head>
<body>

	<form action="criaConta.bb">
		<input name="comando" type="hidden" value="br.com.treinar.bb.command.CriarContaComando">
		
		<input type="radio" name="tipoConta" value="contaCorrente">Corrente
		<input type="radio" name="tipoConta" value="contaPoupanca">Poupança
		<input type="radio" name="tipoConta" value="contaInvestimento">Investimento
		<br />
		<input type="submit" value="Selecionar">
	</form>

</body>
</html>