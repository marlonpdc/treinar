package br.com.treinar.bb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.bb.modelo.exception.BBException;

public interface IComando {

	String executar(HttpServletRequest req, HttpServletResponse resp) throws BBException;
	
}
