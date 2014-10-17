package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.dao.ContatoDAO;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.Comando;

public class SelecionaContatoComando implements Comando {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		Long id = Long.parseLong(request.getParameter("id"));
		ContatoDAO dao = new ContatoDAO();
		Contato contato = dao.recuperarContato(id);
		request.setAttribute("nome", contato.getNome());
		request.setAttribute("email", contato.getEmail());
		request.setAttribute("endereco", contato.getEndereco());
		request.setAttribute("ddd", contato.getTelefone().getDdd());
		request.setAttribute("numero", contato.getTelefone().getNumero());
		request.setAttribute("tipoTelefone", contato.getTelefone().getTipoTelefone().toString());
		
		
		return "pages/editarcontato.jsp";
	}

}
