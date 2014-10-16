<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Criar Contato</title>
</head>
<body>
	<form action="../agenda">
		<input type="hidden" value="br.com.treinar.agenda.comando.CriaContatoComando" name="comando">
		Nome: <input type="text" name="nome" value=""><br />
		Email: <input type="text" name="email"><br />
		Endereço: <input type="text" name="endereco"><br />
		DDD: <input type="text" name="ddd"><br />
		Numero Telefone: <input type="text" name="numero"><br />
		Tipo Telefone
		<select id="tipoTelefone" name="tipoTelefone">
		  <option value="CELULAR">Celular</option>
		  <option value="COMERCIAL">Comercial</option>
		  <option value="RESIDENCIAL">Residencial</option>
		</select>
		<br />
		<input type="submit" value="Gravar">
	</form>
</body>
</html>