package br.com.treinar.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TerceiroServlet
 */
@WebServlet("*.bat")
public class TerceiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private Integer contador;
	
	@Override
	public void init() throws ServletException {
		super.init();
		//contador = new Integer(0);
		contador = 0;
	}
	
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TerceiroServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		//String nome = request.getParameter("nome");
		// escreve o texto
		out.println("<html>");
		out.println("<body>");

		Enumeration<String> parameterNames = request.getParameterNames();
		out.println("<spam>Contador: ");
		out.println(++contador);
		out.println("</spam>");
		
		while (parameterNames.hasMoreElements()) {
			String param = parameterNames.nextElement();
			out.println(param);
			out.println(": ");
			out.println(request.getParameter(param));
			out.println("<br />");
		}
		out.println("</body>");
		out.println("</html>");
		super.service(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("Metodo POST");
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Metodo GET Classe: " + this.toString());
	}

}
