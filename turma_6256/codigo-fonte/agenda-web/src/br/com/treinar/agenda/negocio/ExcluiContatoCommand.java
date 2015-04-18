package br.com.treinar.agenda.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExcluiContatoCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) {
			request.setAttribute("excluir", "Exclusao Efetuada");
			return "/pages/ExcluirContato.jsp";
		}
	}
