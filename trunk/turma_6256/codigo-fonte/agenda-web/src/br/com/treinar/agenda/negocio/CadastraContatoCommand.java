package br.com.treinar.agenda.negocio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.modelo.Contato;
import br.com.agenda.modelo.Pessoa;
import br.com.agenda.modelo.Telefone;
import br.com.agenda.modelo.TipoTelefone;
import br.com.agenda.util.ContatoDatabase;
import br.com.treinar.agenda.AgendaException;

public class CadastraContatoCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws AgendaException {
		
		validarCampos(request);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String nome = request.getParameter("nome");
		String datadNascimento = request.getParameter("dataNascimento");
		String telefone	= request.getParameter("telefone");
		String tipo = request.getParameter("tipo");
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
		c.getTelefone().setTipo(TipoTelefone.valueOf(tipo));
		
		ContatoDatabase.getInstance().getContatos().add(c);
		
		ICommand command = new ListaContatoCommand();
		command.execute(request, response);
		
		return "/pages/listaContato.jsp";
	}
	
	private void validarCampos(HttpServletRequest request) throws AgendaException {
		String nome = request.getParameter("nome");
		String datadNascimento = request.getParameter("dataNascimento");
		String telefone	= request.getParameter("telefone");
		String tipo = request.getParameter("tipo");
		String email = request.getParameter("email");
		Boolean possuiErro = Boolean.FALSE;
		StringBuilder msgErro = new StringBuilder("<ul>");
		if (nome == null || nome.equals("")) {
			possuiErro = Boolean.FALSE;
			msgErro.append("<li>Nome é Obrigatório<li>");
		}
		if (datadNascimento == null || datadNascimento.equals("")) {
			possuiErro = Boolean.FALSE;
			msgErro.append("<li>Data Nascimento é Obrigatório</li>");
		}
		if (telefone == null || telefone.equals("")) {
			possuiErro = Boolean.FALSE;
			msgErro.append("<li>Telefone é Obrigatório</li>");
		}
		if (tipo == null || tipo.equals("")) {
			possuiErro = Boolean.FALSE;
			msgErro.append("<li>Tipo Telefone é Obrigatório</li>");
		}
		if (email == null || email.equals("")) {
			possuiErro = Boolean.FALSE;
			msgErro.append("<li>Email é Obrigatório</li>");
		}
		msgErro.append("</ul>");
		if (!possuiErro) {
			AgendaException agendaException = new AgendaException(msgErro.toString());
			agendaException.setDestino("/pages/CadastraContato.jsp");
			throw agendaException;
		}
	}
	
	

}
