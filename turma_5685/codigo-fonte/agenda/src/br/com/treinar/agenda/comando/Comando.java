package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.util.AppException;

public interface Comando {

	String executar(HttpServletRequest req, HttpServletResponse resp) throws AppException;
	
}
