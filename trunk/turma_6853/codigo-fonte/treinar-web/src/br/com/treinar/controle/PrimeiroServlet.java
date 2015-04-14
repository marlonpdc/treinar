package br.com.treinar.controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.modelo.Pessoa;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet("*.tre")
public class PrimeiroServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private List<Pessoa> pessoas;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeiroServlet() {
        super();
        pessoas = new ArrayList<Pessoa>();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter writer = response.getWriter();
//		Enumeration<String> attributeNames = request.getParameterNames();
//		
//		writer.append("<br />");
//		writer.append("<br />");
//		while (attributeNames.hasMoreElements()) {
//			String atributo = attributeNames.nextElement();
//			writer.append(atributo + ": " + request.getParameter(atributo));
//			writer.append("<br />");
//		}
//		
//		request.getParameterValues("desenhoAnimado");
//		
//		writer.append("<h1>Olá Java " + request.getParameter("nome"));
//		writer.append("<h1>Bom Estudo...<h1>");
//		writer.append("Digite o nome: ");
//		writer.append("<input type='text' value=''>");
		
		String nome = request.getParameter("nome");
		String sexo = request.getParameter("sexo");
		Integer idade = Integer.parseInt(request.getParameter("idade"));
		
		List<String> desenhhos = Arrays.asList(request.getParameterValues("desenhoAnimado"));
		
		
		Pessoa p = new Pessoa(nome, idade, sexo, desenhhos);
		
		pessoas.add(p);
		
		request.setAttribute("listar", pessoas);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listagem.jsp");
		
		requestDispatcher.forward(request, response);
		
		
	}

}
