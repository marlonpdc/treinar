package br.com.treinar.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Comando {

	void executar(HttpServletRequest request, HttpServletResponse response);
	
}
