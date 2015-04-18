package br.com.treinar.agenda.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.negocio.ICommand;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("*.cmd")
public class ServletController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String comando = request.getParameter("comando");
		try {
			ICommand c = (ICommand) Class.forName(comando).newInstance();
			String paginaJSP = c.execute(request, response);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(paginaJSP);
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}

}
