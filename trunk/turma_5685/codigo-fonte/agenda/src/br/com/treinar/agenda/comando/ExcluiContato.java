package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.util.AppException;

public class ExcluiContato implements Comando {

	public String executar(HttpServletRequest req, HttpServletResponse resp) throws AppException {
		String email = req.getParameter("email");
		//TODO - excluir contato
		System.out.println(email);
		return "/pages/cadastroContato.html";
		
	}
	
}
