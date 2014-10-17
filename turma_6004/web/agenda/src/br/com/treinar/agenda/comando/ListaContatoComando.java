package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.util.Comando;

public class ListaContatoComando implements Comando {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		
		ContatoDAO dao = new ContatoDAO();
		request.setAttribute("contatos", dao.getLista());
		return "pages/exibircontato.jsp";
	}

}
