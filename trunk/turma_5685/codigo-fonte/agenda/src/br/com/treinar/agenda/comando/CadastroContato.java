package br.com.treinar.agenda.comando;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;
import br.com.treinar.agenda.util.AppException;
import br.com.treinar.agenda.util.DataBase;

public class CadastroContato implements Comando {
	
	private DataBase instance;
	
	public CadastroContato() {
		instance = DataBase.getInstance();
	}

	public String executar(HttpServletRequest req, HttpServletResponse resp) throws AppException {
		String email = req.getParameter("email");
		Contato c = new Contato();
		c.setEmail(email);
		List<Contato> contatos = instance.getContatos();
		String nome = null;
		String telefone = null;
		String tipoTelefone = null;
		String ddd = null;
		if (!contatos.contains(c)) {
			nome = req.getParameter("nome");
			ddd = req.getParameter("ddd");
			telefone = req.getParameter("telefone");
			tipoTelefone = req.getParameter("tipoTelefone");
			c.setNome(nome);
			c.setTelefone(new Telefone());
			c.getTelefone().setDdd(Integer.parseInt(ddd));
			c.getTelefone().setNumero(Integer.parseInt(telefone));
			c.getTelefone().setTipo(TipoTelefone.valueOf(tipoTelefone));
			DataBase.getInstance().getContatos().add(c);
			req.setAttribute("mensagem", "Contato cadastrado com sucesso!");
		} else {
			AppException appException = new AppException();
			appException.setCausa("Contato já cadastrado!");
			throw appException;
		}
		return "/pages/cadastroContato.jsp";
	}
	
}
