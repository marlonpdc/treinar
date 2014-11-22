package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.DataBase;

public class CadastroContato implements Comando {

	public String executar(HttpServletRequest req, HttpServletResponse resp) {
		
		String nome = req.getParameter("nome");
		String telefone = req.getParameter("telefone");
		String email = req.getParameter("email");
		
		Contato c = new Contato();
		c.setNome(nome);
		c.setTelefone(telefone);
		c.setEmail(email);
		
		DataBase.getInstance().getContatos().add(c);
		
		return "/pages/cadastroContato.jsp";
	}
	
}
