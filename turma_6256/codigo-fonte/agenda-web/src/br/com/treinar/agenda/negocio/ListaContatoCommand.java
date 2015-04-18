package br.com.treinar.agenda.negocio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.modelo.Contato;
import br.com.agenda.util.ContatoDatabase;

public class ListaContatoCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Contato> contatos = ContatoDatabase.getInstance().getContatos();
		
		request.setAttribute("listaContatos", contatos);
		return "/pages/listaContato.jsp";
	}

}
