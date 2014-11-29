package br.com.treinar.agenda.comando;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.DataBase;

public class ListaContato implements Comando {

	public String executar(HttpServletRequest req, HttpServletResponse resp) {
		List<Contato> contatos = DataBase.getInstance().getContatos();
		req.setAttribute("contatos", contatos);			
		if (contatos.isEmpty()) {
			req.setAttribute("mensagem", "Nenhum contato cadastrado!");
		}
		return "/pages/listaContato.jsp";
	}
	
}
