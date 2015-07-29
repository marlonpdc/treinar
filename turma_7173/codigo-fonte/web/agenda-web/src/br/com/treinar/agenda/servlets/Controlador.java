package br.com.treinar.agenda.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.comando.Comando;
import br.com.treinar.agenda.exceptions.AgendaException;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("*.cmd")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<Integer, String> comandos;
    
	public Controlador() {
    }
    
    @Override
    public void init() throws ServletException {
    	comandos = new HashMap<>();
    	comandos.put(1, "br.com.treinar.agenda.comando.ComandoCriaContato");
    	comandos.put(2, "br.com.treinar.agenda.comando.ComandoListaContato");
    	comandos.put(3, "br.com.treinar.agenda.comando.ComandoRemoveContato");
    	comandos.put(4, "br.com.treinar.agenda.comando.ComandoEditaContato");
    	super.init();
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String comando = request.getParameter("comando");
		String classe = comandos.get(Integer.parseInt(comando));

		try {
			Comando c = (Comando) Class.forName(classe).newInstance();
			String pagina = c.executar(request, response);
			RequestDispatcher d = request.getRequestDispatcher(pagina);
			d.forward(request, response);
		} catch (AgendaException e) {
			request.setAttribute("erro", e.getChave());
			RequestDispatcher d = request.getRequestDispatcher(e.getPage());
			d.forward(request, response);
		} catch (Exception e) {
			
		}
	}
}
