<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Conta Investimento</title>
</head>
<body>

	<form action="contaInvestimento.bb">
		<input type="hidden" value="br.com.treinar.bb.command.CriarContaCorrenteComando">
		<table>
			<jsp:include page="/telas/contaPadrao.jsp" />
			<tr>
				<td>
					Taxa de Rendimento:
				</td>
				<td>
					<input type="text" name="taxaRendimento">
				</td>
			</tr>
			<tr>
				<td>
					Taxa de Manutenção:
				</td>
				<td>
					<input type="text" name="taxaManutencao">
				</td>
			</tr>
		</table>
	
	</form>

</body>
</html>