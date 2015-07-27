package br.com.treinar.agenda.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.exceptions.AgendaException;

public interface Comando {

	void executar(HttpServletRequest request, HttpServletResponse response) throws AgendaException, Exception;
	
}
