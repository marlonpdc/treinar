package br.com.treinar.controle;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.modelo.DataBase;
import br.com.treinar.modelo.Pessoa;

public class GravaPessoa implements IComando {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String nome = request.getParameter("nome");
		String sexo = request.getParameter("sexo");
		Integer idade = Integer.parseInt(request.getParameter("idade"));
		
		List<String> desenhhos = Arrays.asList(request.getParameterValues("desenhoAnimado"));
		
		
		Pessoa p = new Pessoa(nome, idade, sexo, desenhhos);
		
		DataBase.pessoas.add(p);
		
		request.setAttribute("listar", DataBase.pessoas);
		
		return "/listagem.jsp";
	}

	
	
}
