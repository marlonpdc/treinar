package br.com.treinar.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.util.AgendaException;

public class LoginService implements Comando {

	@Override
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws AgendaException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		System.out.println(senha);
		
		request.getSession().setAttribute("login", login);
		
		validarAcesso();
		
		return "/pages/home/home.jsp";
		
	}

	private void validarAcesso() throws AgendaException {
		// TODO Auto-generated method stub
	}

}
