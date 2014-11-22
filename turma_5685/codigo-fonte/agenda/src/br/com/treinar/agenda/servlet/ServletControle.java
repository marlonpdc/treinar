package br.com.treinar.agenda.servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.comando.Comando;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet({ "*.controle" })
public class ServletControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private final String PATH;

	public ServletControle() {
		PATH = "br.com.treinar.agenda.comando.";
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String comando = req.getParameter("comando");
		Comando c;
		RequestDispatcher dispatcher = null;
		try {
			c = (Comando) Class.forName(PATH + comando).newInstance();
			String retorno = c.executar(req, resp);
			dispatcher = req.getRequestDispatcher(retorno);
			//resp.sendRedirect(retorno);
		} catch (Exception e) {
			dispatcher = req.getRequestDispatcher("/index.html");
			Logger.getLogger(ServletControle.class.getSimpleName()).log(Level.SEVERE, "deu zica");
		}
		dispatcher.forward(req, resp);
	}
}
