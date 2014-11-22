package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditaContato implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) {
		return "/pages/cadastroContato.html";
	}
	
}
