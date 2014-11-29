package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.TipoTelefone;
import br.com.treinar.agenda.util.DataBase;

public class SelecionaContato implements Comando {
	
	private DataBase database;
	
	public SelecionaContato() {
		database = DataBase.getInstance();
	}

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) {
		init(req);
		
		String email = req.getParameter("email");
		Contato contato = database.getContatoById(email);
		req.setAttribute("contato", contato);
		return "/pages/editaContato.jsp";
	}
	
	private void init(HttpServletRequest req) {
		req.setAttribute("tipos", TipoTelefone.values());
	}
	
}
