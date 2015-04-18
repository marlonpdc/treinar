package br.com.treinar.agenda.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditaContatoCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("edita", "Edita");
		return "/pages/editaContato.jsp";
	}

}
