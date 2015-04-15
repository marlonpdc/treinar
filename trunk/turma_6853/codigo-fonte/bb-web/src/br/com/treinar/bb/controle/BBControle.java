package br.com.treinar.bb.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.bb.command.IComando;

/**
 * Servlet implementation class BBControle
 */
@WebServlet("*.bb")
public class BBControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BBControle() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String comandoStr = request.getParameter("comando");
			IComando comando = (IComando) Class.forName(comandoStr).newInstance();
			String retorno = comando.executar(request, response);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(retorno);
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
