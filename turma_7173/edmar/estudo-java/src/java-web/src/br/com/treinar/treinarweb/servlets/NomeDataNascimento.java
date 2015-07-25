package br.com.treinar.treinarweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NomeDataNascimento
 */
@WebServlet(name = "nomedatanascimento", urlPatterns = { "/nomedatanascimento" })
public class NomeDataNascimento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NomeDataNascimento() {
        super();
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message ="Edmar";
		

		DateFormat data = DateFormat.getInstance();
		
		// Set response content type
		response.setContentType("text/html");
		
		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + data + "</h1>");
	}

}
