package br.com.treinar.agenda.negocio;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.modelo.Contato;
import br.com.agenda.util.ContatoDatabase;

public class ExcluiContatoCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) {
			request.setAttribute("excluir", "Exclusao Efetuada");
			List<Contato> contatos = ContatoDatabase.getInstance().getContatos();
			Long id = Long.parseLong(request.getParameter("id"));
			Iterator<Contato> iterator = contatos.iterator();
			while (iterator.hasNext()) {
				Contato contato = iterator.next();
				if (contato.getId().equals(id)) {
					iterator.remove();
					break;
				}				
			}
			request.setAttribute("listaContatos", contatos);
			return "/pages/listaContato.jsp";
		}
	}
