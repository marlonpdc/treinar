package br.com.treinar.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.service.Comando;

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
		try {
			Comando comando = (Comando) Class.forName(comandoStr).newInstance();
			comando.executar(request, response);
		} catch (Exception e) {
			System.out.println();
		}
	}

}
