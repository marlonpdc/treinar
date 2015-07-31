package br.com.treinar.agenda.comando;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.Contato;
import br.com.treinar.agenda.Database;
import br.com.treinar.agenda.Telefone;
import br.com.treinar.agenda.TipoTelefone;
import br.com.treinar.agenda.exceptions.AgendaException;

public class ComandoEditaContato implements Comando {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws AgendaException, Exception {
		
		List<Contato> contatos = Database.getInstance().getContatos();

		String nome = request.getParameter("nomePessoa");

		Iterator<Contato> contatosIt = contatos.iterator();

		Contato contato = null;
		
		while (contatosIt.hasNext()) {
			contato = contatosIt.next();
			if (contato.getPessoa().getNome().equals(nome)) {
				break;
			}
		}
		
		if (contato != null) {
			String dataNascimento = request.getParameter("dataNascimento");
			String dddTelefone = request.getParameter("dddTelefone");
			String numeroTelefone = request.getParameter("numeroTelefone");

			contato.setDataCadastro(new Date());
			Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(dataNascimento);
			contato.getPessoa().setDataNascimento(parse);
			contato.setTelefones(new ArrayList<Telefone>());
			Telefone t = new Telefone();
			t.setDdd(Integer.parseInt(dddTelefone));
			t.setNumero(Integer.parseInt(numeroTelefone));
			String ordinalTipoTelefone = request.getParameter("tipoTelefone");
			t.setTipoTelefone(TipoTelefone.values()[Integer.parseInt(ordinalTipoTelefone)]);
			contato.getTelefones().add(t);
			
		} else {
			AgendaException agendaException = new AgendaException();
			agendaException.setChave("Usuário não cadastrado");
			throw agendaException;
		}
		
		ComandoListaContato cmdList = new ComandoListaContato();
		cmdList.executar(request, response);
		
		return "/paginas/lista-contatos.jsp";

	}

}
