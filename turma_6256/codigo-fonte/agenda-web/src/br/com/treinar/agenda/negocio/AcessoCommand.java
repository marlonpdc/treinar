package br.com.treinar.agenda.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.modelo.Pessoa;

public class AcessoCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) {
		Pessoa p = new Pessoa();
		p.setNome(request.getParameter("nome"));
		request.getSession().setAttribute("pessoa", p);
		return "/index.jsp";
	}
}
