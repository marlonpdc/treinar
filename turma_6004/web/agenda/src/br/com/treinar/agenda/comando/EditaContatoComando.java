package br.com.treinar.agenda.comando;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;
import br.com.treinar.agenda.util.Comando;

public class EditaContatoComando implements Comando {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		
		Contato contato = new Contato();
		contato.setEmail(request.getParameter("email"));
		contato.setEndereco(request.getParameter("endereco"));
		contato.setNome(request.getParameter("nome"));
		contato.setTelefone(new Telefone());
		contato.getTelefone().setDdd(Integer.parseInt(request.getParameter("ddd")));
		contato.getTelefone().setNumero(Integer.parseInt(request.getParameter("numero")));
		TipoTelefone tipoTelefone = TipoTelefone.valueOf(request.getParameter("tipoTelefone"));
		contato.getTelefone().setTipoTelefone(tipoTelefone);
		
		ContatoDAO dao = new ContatoDAO();
		String retorno = null;
		
			dao.editar(contato);
			
			ListaContatoComando listaContato = new ListaContatoComando();
			retorno = listaContato.executar(request, response);
			
		
		return retorno;
	}

}
