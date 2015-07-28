package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.exceptions.AgendaException;

public interface Comando {

	String executar(HttpServletRequest request, HttpServletResponse response) throws AgendaException, Exception;
	
}
