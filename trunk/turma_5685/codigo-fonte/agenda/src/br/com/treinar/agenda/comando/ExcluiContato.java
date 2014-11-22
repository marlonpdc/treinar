package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExcluiContato implements Comando {

	public String executar(HttpServletRequest req, HttpServletResponse resp) {
		String email = req.getParameter("email");
		//TODO - excluir contato
		System.out.println(email);
		return "/pages/cadastroContato.html";
		
	}
	
}
