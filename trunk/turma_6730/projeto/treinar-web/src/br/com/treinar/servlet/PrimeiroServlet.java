package br.com.treinar.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet(urlPatterns={"*.pdf", "/gleidson"}, loadOnStartup=1)
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrimeiroServlet() {
		super();
	}

	@Override
	public void init() throws ServletException {
		super.init();
		message = "Hello World";
		System.out.println(message);
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("primeira_jsp.jsp");
		
		Integer cont = request.getSession().getAttribute("cont") != null ? ((Integer)request.getSession().getAttribute("cont")) : 1;
		request.getSession().setAttribute("cont", ++cont);
		
		String matricula = request.getParameter("matricula");
		List<Pessoa> pessoas = Util.pessoas;
		Pessoa p = null;
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getMatricula().equals(Integer.parseInt(matricula))) {
				p = pessoa;
				break;
			}
		}
		
		request.setAttribute("pessoa", p);
		
		dispatcher.forward(request, response);
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("o servlet serah removido");
	}
	
}
