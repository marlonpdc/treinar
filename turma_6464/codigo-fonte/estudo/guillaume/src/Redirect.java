

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.modelo.Pessoa;

/**
 * Servlet implementation class Redirect
 */
@WebServlet("/Redirect")
public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Redirect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa();
		p.setNome(request.getParameter("nome"));
		p.setSobrenome(request.getParameter("sobrenome"));
		

		request.setAttribute("pessoa", p);
		RequestDispatcher rd = request.getRequestDispatcher("/ExibirNome.jsp");  
		rd.forward(request, response);
		//response.sendRedirect("/agenda/pages/primeiraJSP.jsp");
	}

}

