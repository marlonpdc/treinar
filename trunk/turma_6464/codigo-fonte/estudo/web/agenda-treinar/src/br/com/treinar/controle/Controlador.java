package br.com.treinar.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.service.Comando;
import br.com.treinar.util.AgendaException;

/**
 * Servlet implementation class Controlador
 */
@WebServlet(value="*.cmd", loadOnStartup = 1)
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String comandoStr = request.getParameter("comando");
		RequestDispatcher rd = null;
		try {
			Comando comando = (Comando) Class.forName(comandoStr).newInstance();
			String path = comando.executar(request, response);
			rd = request.getRequestDispatcher(path);  
			rd.forward(request, response);
			
		} catch (AgendaException age) {
			request.setAttribute("erro", age.getDescricao());
			rd = request.getRequestDispatcher("/pages/home/home.jsp");
			rd.forward(request, response);			
		} catch (Exception e) {
			try {
				throw e;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}
