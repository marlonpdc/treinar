package br.com.treinar.agenda.negocio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.modelo.Contato;
import br.com.agenda.modelo.Pessoa;
import br.com.agenda.modelo.Telefone;
import br.com.agenda.util.ContatoDatabase;

public class CadastraContatoCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		String nome = request.getParameter("nome");
		String datadNascimento = request.getParameter("dataNascimento");
		String telefone	= request.getParameter("telefone");
		String email = request.getParameter("email");
		
		Contato c = new Contato();
		c.setPessoa(new Pessoa());
		c.getPessoa().setNome(nome);
		try {
			c.getPessoa().setDataNascimento(df.parse(datadNascimento));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		c.setEmail(email);
		c.setTelefone(new Telefone());
		Integer ddd = Integer.parseInt(telefone.substring(1, 3));
		Integer numero = Integer.parseInt(telefone.substring(5));
		c.getTelefone().setDdd(ddd);
		c.getTelefone().setNumero(numero);
		
		ContatoDatabase.getInstance().getContatos().add(c);
		
		ICommand command = new ListaContatoCommand();
		command.execute(request, response);
		
		return "/pages/listaContato.jsp";
	}

}
