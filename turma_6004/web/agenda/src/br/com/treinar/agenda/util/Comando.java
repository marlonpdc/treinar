package br.com.treinar.agenda.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Comando {

	
	String executar(HttpServletRequest request, HttpServletResponse response);
	
	
}
