<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script>
  $(function() {
    $( "#menu" ).menu();
  });
  </script>
<style>
.ui-menu {
	width: 150px;
}
</style>

<title>Insert title here</title>

</head>
<body>
<%-- 		<%= request.getAttribute("msg") != null ? request.getAttribute("msg") : "" %> --%>
${msg}
<ul id="menu">
  <li><a href="/bb-web/telas/criaConta.jsp" />Criar Conta</a></li>
  <li><a href="lista.bb?comando=br.com.treinar.bb.command.ListarContaComando">Listar Contas</a></li>
</ul>
<br />
<br />
<br />
</body>
</html>