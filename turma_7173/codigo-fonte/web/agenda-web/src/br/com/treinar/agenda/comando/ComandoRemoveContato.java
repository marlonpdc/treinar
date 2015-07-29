package br.com.treinar.agenda.comando;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.Contato;
import br.com.treinar.agenda.exceptions.AgendaException;
import br.com.treinar.agenda.util.Database;

public class ComandoRemoveContato implements Comando {

	@Override
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws AgendaException, Exception {
		List<Contato> contatos = Database.getInstance().getContatos();

		String nome = request.getParameter("nomePessoa");

		Iterator<Contato> contatosIt = contatos.iterator();

		while (contatosIt.hasNext()) {
			Contato contato = contatosIt.next();
			if (contato.getPessoa().getNome().equals(nome)) {
				contatosIt.remove();
				break;
			}
		}

		/*
		 * for (int i = 0; i < contatos.size(); i++) { if
		 * (contatos.get(i).getPessoa().getNome().equals(nome)) {
		 * contatos.remove(i); } }
		 */
		
		ComandoListaContato cmdList = new ComandoListaContato();
		cmdList.executar(request, response);
		
		return "/paginas/lista-contatos.jsp";
	}

}
