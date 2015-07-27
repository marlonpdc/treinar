package br.com.treinar.agenda.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.Contato;

import com.sun.corba.se.pept.transport.ContactInfo;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("*.cmd")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controlador() {
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contato c = new Contato();
		System.out.println(c);
		response.getWriter().append("ativo...");
	}

}
