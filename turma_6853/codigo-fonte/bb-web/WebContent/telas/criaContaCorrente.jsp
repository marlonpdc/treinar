<%@page import="br.com.treinar.bb.modelo.StatusConta"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Conta Corrente</title>
</head>
<body>
	<br />
	<jsp:include page="/telas/menu.jsp" />
	
	<form action="contaCorrente.bb" method="post">
		<input name="comando" type="hidden" value="br.com.treinar.bb.command.CriarContaCorrenteComando">
		<table>
			<jsp:include page="/telas/contaPadrao.jsp" />
			<tr>
				<td>
					Limite de Crédito:
				</td>
				<td>
					<input type="text" name="limiteCredito" value="${conta.limiteCredito}">
				</td>
			</tr>
			<tr>
				<td>
					Taxa de Manutenção:
				</td>
				<td>
					<input type="text" name="taxaManutencao" value="${taxaManutencao}">
				</td>
			</tr>
		</table>
		<input type="submit" value="Criar Conta">
	</form>

</body>
</html>