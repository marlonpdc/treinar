<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Criar Contato</title>
</head>
<body>

	<form id="form-1" action="novo.cmd">
		
		<div style="width: 60%; margin: 0;">
			<input id="comando" name="comando" type="hidden" value="1">

			<div class="ui-field-contain">
				<label for="nome">Nome:</label> <input name="nome" id="nome"
					data-clear-btn="true" value="" type="text" />
			</div>
			<div class="ui-field-contain">
				<label for="dataNascimento">Data Nascimento:</label> <input
					name="dataNascimento" id="dataNascimento" data-clear-btn="true"
					value="" type="date" />
			</div>
			<div class="ui-field-contain">
				<label for="dddTelefone">DDD Telefone:</label> <input
					name="dddTelefone" id="dddTelefone" data-clear-btn="true"
					style="width: 50px;" type="text" />
			</div>
			<div class="ui-field-contain">
				<label for="dddTelefone">Numero Telefone:</label> <input
					name="numeroTelefone" id="numeroTelefone" data-clear-btn="true"
					value="" type="text" />
			</div>
			<div class="ui-field-contain">
				<label for="select-1">Tipo Telefone:</label>
				<select name="tipoTelefone" id="tipoTelefone">
					<option value="0">Residencial</option>
					<option value="1">Celular</option>
					<option value="2">Comercial</option>
				</select>
			</div>
			<div class="ui-field-contain">
				<input name="voltar" id="voltar" data-clear-btn="true" size="10" value="Salvar"
					type="submit" />
			</div>

		</div>

	</form>

</body>
</html>