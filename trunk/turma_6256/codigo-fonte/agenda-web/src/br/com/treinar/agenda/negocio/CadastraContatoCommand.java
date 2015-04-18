package br.com.treinar.agenda.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastraContatoCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("testeArquitetura", "CadastraContato");
		return "/pages/CadastraContato.jsp";
	}

}
