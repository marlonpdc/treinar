<%@ page import="br.com.treinar.bb.modelo.StatusConta"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<tr>
	<td>
		Nome:
	</td>
	<td>
		<input type="text" name="nome" value="${nome}">
	</td>
</tr>
<tr>
	<td>
		CPF:
	</td>
	<td>
		<input type="text" name="cpf" value="${cpf}">
	</td>
</tr>
<tr>
	<td>
		Saldo:
	</td>
	<td>
		<input type="text" name="saldo" value="${saldo}">
	</td>
</tr>
<tr>
	<td>
		Status:
	</td>
	<td>
		<select name="status">
			<c:forEach items="${status}" var="statusConta">
				<option>${statusConta}</option>
			</c:forEach>
			
			
<%-- 			<% --%>
<!-- 				List<StatusConta> status = (List<StatusConta>) request.getAttribute("status"); -->
<!-- 				for(StatusConta st : status) { -->
<!-- 					out.write("<option>"); -->
<!-- 					out.write(st.getDescricao()); -->
<!-- 					out.write("</option>"); -->
<!-- 				} -->
<!-- 			%> -->
		</select>
	</td>
</tr>