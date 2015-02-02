package br.com.treinar.agenda.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRedirect
 */
@WebServlet("/redirect")
public class ServletRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletRedirect() {
		super();
	}

	@Override
	protected void service(HttpServletRequest request, 
						   HttpServletResponse response)
			throws ServletException, IOException {
		List<String> nomes = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			nomes.add("Nome " + ((i + 1) * i));
		}
		//request.setAttribute("listaNomes", nomes);
		RequestDispatcher rd = request.getRequestDispatcher("/pages/primeiraJSP.jsp");  
		rd.forward(request, response);
		//response.sendRedirect("/agenda/pages/primeiraJSP.jsp");
	}

}
