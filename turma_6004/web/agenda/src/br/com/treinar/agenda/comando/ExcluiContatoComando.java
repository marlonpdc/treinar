package br.com.treinar.agenda.comando;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;
import br.com.treinar.agenda.util.Comando;

public class ExcluiContatoComando implements Comando {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		ContatoDAO dao = new ContatoDAO();
		Contato c = dao.recuperarContato(id);
		
		dao.excluirContato(c);
		ListaContatoComando listar = new ListaContatoComando();
		String retorno = listar.executar(request, response);
		
		return retorno;
	}

}
