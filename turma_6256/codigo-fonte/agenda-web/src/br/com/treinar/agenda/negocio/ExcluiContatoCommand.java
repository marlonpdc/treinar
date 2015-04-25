package br.com.treinar.agenda.negocio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.modelo.Contato;
import br.com.agenda.util.ContatoDatabase;

public class ExcluiContatoCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) {
			List<Contato> contatos = ContatoDatabase.getInstance().getContatos();
			Long id = Long.parseLong(request.getParameter("id"));
			Contato c = new Contato();
			c.setId(id);
			//utilizando implementação do equals
			contatos.remove(c);
			
			
			/*Iterator<Contato> iterator = contatos.iterator();
			while (iterator.hasNext()) {
				Contato contato = iterator.next();
				if (contato.getId().equals(id)) {
					iterator.remove();
					break;
				}				
			}*/
			
			ICommand command = new ListaContatoCommand();
			command.execute(request, response);
			
			return "/pages/listaContato.jsp";
		}
	}
