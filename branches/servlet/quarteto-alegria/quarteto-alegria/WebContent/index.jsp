<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quarteto Alegria</title>
</head>
<body>

	<form action="listar.qal">
		<input name="comando" type="hidden" value="br.com.quartetoalegreto.orcamento.controle.GerenciaOrcamentoCommand">
		<input type="submit" value="Listar">
		<a href="/pages/cadastro-orcamento.jsp">Cadastrar Or�amento</a>
		<a href="/pages/acompanhamento-orcamento.jsp">Acompanhar Or�amento</a>
	</form>

</body>
</html>