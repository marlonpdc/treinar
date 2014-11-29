package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AppException;
import br.com.treinar.agenda.util.DataBase;

public class ExcluiContato implements Comando {

	public String executar(HttpServletRequest req, HttpServletResponse resp) throws AppException {
		String email = req.getParameter("email");
		Contato c = new Contato();
		c.setEmail(email);
		DataBase.getInstance().getContatos().remove(c);
		req.setAttribute("mensagem", "Contato " + c.getEmail() + " removido com sucesso!!");
		
		Comando cmd = new ListaContato();
		return cmd.executar(req, resp);
		
	}
	
}
