<%@page import="br.com.treinar.modelo.TipoTelefone"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Contatos</title>
</head>
<body>

	
	<form action="cadastro.cmd">
	
		<input type="hidden" value="br.com.treinar.service.GravarContato" name="comando" />
		
		<div class="ui-field-contain">
			Nome: <input type="text" name="nome">
		</div>
		<div class="ui-field-contain">
			Email: <input type="text" name="email">	
		</div>
		<div class="ui-field-contain">
			Telefone: <input type="text" name="telefone">
		</div>
		<div class="ui-field-contain">
			<label for="tipoTelefone">Tipo Telefone:</label>
			<select name="tipoTelefone" id="tipoTelefone">
				<option value="">Selecione</option>
				<%
				
					ServletContext context = request.getSession().getServletContext();
					
					TipoTelefone[] tipos = (TipoTelefone[]) context.getAttribute("tiposTelefone");
					
					
					for(int i = 0; i < tipos.length; i++) {
						out.println("<option value=\"");
						out.println(tipos[i]);
						out.println("\">");
						out.println(tipos[i].getDescricao());
						out.println("</option>");
					}
				
				
				%>
			</select>
		</div>
		<div class="ui-field-contain">
			Endereço: <input type="text" name="endereco"><br />
		</div>
		<div class="ui-field-contain">
			<input type="submit" value="Gravar Contato">
		</div>
	
	</form>



</body>
</html>