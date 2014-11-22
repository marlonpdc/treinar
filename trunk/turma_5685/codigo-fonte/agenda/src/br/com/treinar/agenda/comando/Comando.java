package br.com.treinar.agenda.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Comando {

	String executar(HttpServletRequest req, HttpServletResponse resp);
	
}
