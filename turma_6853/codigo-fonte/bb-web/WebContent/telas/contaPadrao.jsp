<%@ page import="br.com.treinar.bb.modelo.StatusConta"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<tr>
	<td>
		Nome:
	</td>
	<td>
		<input type="text" name="nome">
	</td>
</tr>
<tr>
	<td>
		CPF:
	</td>
	<td>
		<input type="text" name="cpf">
	</td>
</tr>
<tr>
	<td>
		Saldo:
	</td>
	<td>
		<input type="text" name="saldo">
	</td>
</tr>
<tr>
	<td>
		Status:
	</td>
	<td>
		<select name="status">
			<%
				List<StatusConta> status = (List<StatusConta>) request.getAttribute("status");
				for(StatusConta st : status) {
					out.write("<option>");
					out.write(st.getDescricao());
					out.write("</option>");
				}
			
			%>
		</select>
	</td>
</tr>