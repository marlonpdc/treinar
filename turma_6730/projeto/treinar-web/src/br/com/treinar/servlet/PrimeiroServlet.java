package br.com.treinar.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Enumeration;

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
		
		Enumeration<String> parameterNames = request.getParameterNames();
		
		while (parameterNames.hasMoreElements()) {
			String param = parameterNames.nextElement();
			System.out.println(param + " - " + request.getParameter(param));
		}
		
		String nome = request.getParameter("nome");
		String status = request.getParameter("funcao");
		
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>Olá " + nome + " Bom ter você como " + status +"(a) </h1>");


		System.out.println("Access: " + Calendar.getInstance().get(Calendar.SECOND));
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("o servlet serah removido");
	}
	
}
