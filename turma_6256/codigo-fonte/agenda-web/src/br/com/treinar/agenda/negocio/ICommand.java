package br.com.treinar.agenda.negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ICommand {

	String execute(HttpServletRequest request, HttpServletResponse response);
	//http://localhost:8080/agenda-web/listar.cmd?comando=br.com.treinar.agenda.negocio.ListaContatoCommand
}
