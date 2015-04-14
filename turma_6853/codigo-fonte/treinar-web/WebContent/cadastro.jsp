<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Primeira JSP</title>
</head>
<body>

	<form action="primeiro.cmd">
		<input name="comando" type="hidden" value="br.com.treinar.controle.GravaPessoa"> 
		<span>Nome:</span>
		<input type="text" id="nome" name="nome"><br /><br />
		<span>Idade:</span>
		<input type="text" id="idade" name="idade"><br /><br />
		<span>Sexo:</span>
		<input type="text" id="sexo" name="sexo"><br /><br />
		
		<input type="checkbox" name="desenhoAnimado" value="pepa">Pepa<br>
  		<input type="checkbox" name="desenhoAnimado" value="galinhaPintad">Galinha Pintadinha<br>
  		<input type="checkbox" name="desenhoAnimado" value="turmaMonica">Turma da Mônica<br>
  		<br /><br />
		<input type="submit" value="Enviar">
	
	</form>

</body>
</html>