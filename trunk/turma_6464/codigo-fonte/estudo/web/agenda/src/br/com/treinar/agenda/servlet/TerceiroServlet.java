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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TerceiroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");
        // escreve o texto
        out.println("<html>");
        out.println("<body>");
        
        Enumeration<String> parameterNames = request.getParameterNames();
		
        while (parameterNames.hasMoreElements()) {
        	String param = parameterNames.nextElement();
        	out.println(param);
        	out.println(": ");
        	out.println(request.getParameter(param));
        	out.println("<br />");
        }
        out.println("</body>");
        out.println("</html>");
	}

}
