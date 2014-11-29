package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.DataBase;

public class EditaContato implements Comando {
	
	private DataBase database;
	
	public EditaContato() {
		database = DataBase.getInstance();
	}

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) {
		String email = req.getParameter("contato");
		
		Contato contato = database.getContatoById(email);
		
		req.setAttribute("contato", contato);
		
		return "/pages/editaContato.jsp";
	}
	
}
