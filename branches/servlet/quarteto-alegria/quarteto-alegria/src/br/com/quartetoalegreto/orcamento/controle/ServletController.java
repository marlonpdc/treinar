package br.com.quartetoalegreto.orcamento.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("*.qal")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher d = null;
		String comando = request.getParameter("comando");
		try {
			ICommand c = (ICommand) Class.forName(comando).newInstance();
			String pagina = c.executar(request, response);
			d = request.getRequestDispatcher(pagina);
			d.forward(request, response);
		} catch (Exception e) {
			d = request.getRequestDispatcher("");
		}
		
	}

}
