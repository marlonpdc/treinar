package br.com.treinar.agenda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.util.Comando;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/agenda")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strComando = request.getParameter("comando");
		try {
			Class<?> c = Class.forName(strComando);
			Comando comando = (Comando) c.newInstance();
			String retorno = comando.executar(request, response);
			response.sendRedirect(retorno);
			RequestDispatcher rd = request.getRequestDispatcher(retorno);
			rd.forward(request, response);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
