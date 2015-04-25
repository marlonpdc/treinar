package br.com.treinar.agenda.negocio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.modelo.Contato;
import br.com.agenda.util.ContatoDatabase;

public class SelecionaContatoCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Contato> contatos = ContatoDatabase.getInstance().getContatos();
		Long id = Long.parseLong(request.getParameter("id"));
		Contato contato = new Contato();
		contato.setId(id);
		Integer index = contatos.indexOf(contato);
		Contato c = contatos.get(index);
		request.setAttribute("contato", c);
		return "/pages/editaContato.jsp";
	}

}
