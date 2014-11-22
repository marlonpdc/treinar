package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.util.DataBase;

public class ListaContato implements Comando {

	public String executar(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("contatos", DataBase.getInstance().getContatos());
		return "/pages/listaContato.jsp";
	}
	
}
