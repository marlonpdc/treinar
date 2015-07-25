package br.com.treinar.treinarweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet("/PrimeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String message ="Cadastro";

		// Set response content type
		resp.setContentType("text/html");
		
		// Actual logic goes here.
		PrintWriter out = resp.getWriter();
		
		
		out.println("<h1>" + message + "</h1>");
		out.println("<h1>" + req.getParameter("nome") + "</h1>");
		out.println("<h1>" + req.getParameter("idade") + "</h1>");
		out.println("<h1>" + req.getParameter("email") + "</h1>");
		
		
	}

}
