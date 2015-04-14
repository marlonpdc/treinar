package br.com.treinar.bb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IComando {

	String executar(HttpServletRequest req, HttpServletResponse resp) throws Exception;
	
}
