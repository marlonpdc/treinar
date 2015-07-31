package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.Database;
import br.com.treinar.agenda.exceptions.AgendaException;

public class ComandoListaContato implements Comando {

	@Override
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws AgendaException, Exception {
		request.setAttribute("contatos", Database.getInstance().getContatos());
		
		return "/paginas/lista-contatos.jsp";
	}

}
