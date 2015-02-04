package br.com.treinar.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.util.AgendaException;

public interface Comando {

	/**
	 * 
	 * @param request obj requisicao
	 * @param response obj resposta
	 * @return String contendo a url para onde o fluxo deve ser emcaminhado
	 * @throws AgendaException excecao de negocio
	 */
	String executar(HttpServletRequest request, HttpServletResponse response) throws AgendaException;
	
}
