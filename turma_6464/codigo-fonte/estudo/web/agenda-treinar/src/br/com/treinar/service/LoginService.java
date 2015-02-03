package br.com.treinar.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginService implements Comando {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		System.out.println(senha);
		
		request.getSession().setAttribute("login", login);
		
		RequestDispatcher rd = request.getRequestDispatcher("/pages/home/home.jsp");  
		try {
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
