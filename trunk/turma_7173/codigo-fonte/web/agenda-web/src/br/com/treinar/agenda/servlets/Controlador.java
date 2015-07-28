package br.com.treinar.agenda.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
    	super.init();
    	
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String comando = request.getParameter("comando");
		String classe = comandos.get(Integer.parseInt(comando));
		try {
			Comando c = (Comando) Class.forName(classe).newInstance();
			c.executar(request, response);
		} catch (AgendaException e) {
			e.printStackTrace();
		} catch (Exception e) {
			
		}
	}

}
