package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.TipoTelefone;
import br.com.treinar.agenda.util.AppException;
import br.com.treinar.agenda.util.DataBase;

public class EditaContato implements Comando {
	
	private DataBase database;
	
	public EditaContato() {
		database = DataBase.getInstance();
	}

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) throws AppException {
		String email = req.getParameter("email");
		String nome = req.getParameter("nome");
		String telefone = req.getParameter("telefone");
		String ddd = req.getParameter("ddd");
		String tipoTelefone = req.getParameter("tipoTelefone");
		String contato = req.getParameter("contato");
		
		Contato c = database.getContatoById(contato);		
		c.setNome(nome);
		c.setEmail(email);
		c.getTelefone().setDdd(Integer.parseInt(ddd));
		c.getTelefone().setNumero(Integer.parseInt(telefone));
		c.getTelefone().setTipo(TipoTelefone.valueOf(tipoTelefone));
		
		req.setAttribute("mensagem", "Contato " + c.getNome() + " editado com sucesso!");
		
		Comando cmd = new ListaContato();
		return cmd.executar(req, resp);
	}
	
}
