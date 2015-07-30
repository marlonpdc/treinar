package br.com.treinar.agenda.comando;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.Contato;
import br.com.treinar.agenda.exceptions.AgendaException;
import br.com.treinar.agenda.util.Database;

public class ComandoSelecionaContato implements Comando {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws AgendaException, Exception {
		
		List<Contato> contatos = Database.getInstance().getContatos();

		String nome = request.getParameter("nomePessoa");

		Iterator<Contato> contatosIt = contatos.iterator();

		Contato contato = null;
		
		while (contatosIt.hasNext()) {
			contato = contatosIt.next();
			if (contato.getPessoa().getNome().equals(nome)) {
				break;
			}
		}
		request.setAttribute("contato", contato);
		
		return "/paginas/edita-contato.jsp";

	}

}
