package br.com.treinar.agenda.negocio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.modelo.Contato;
import br.com.agenda.util.ContatoDatabase;

public class EditaContatoCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String datadNascimento = request.getParameter("dataNascimento");
		String telefone	= request.getParameter("telefone");
		String email = request.getParameter("email");
		Contato temp = new Contato();
		temp.setId(id);
		final List<Contato> contatos = ContatoDatabase.getInstance().getContatos();
		Contato c = contatos.get(contatos.indexOf(temp));
		c.getPessoa().setNome(nome);
		try {
			c.getPessoa().setDataNascimento(df.parse(datadNascimento));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		c.setEmail(email);
		Integer ddd = Integer.parseInt(telefone.substring(1, 3));
		Integer numero = Integer.parseInt(telefone.substring(5));
		c.getTelefone().setDdd(ddd);
		c.getTelefone().setNumero(numero);

		ICommand command = new ListaContatoCommand();
		command.execute(request, response);
		
		return "/pages/listaContato.jsp";
	}

}
