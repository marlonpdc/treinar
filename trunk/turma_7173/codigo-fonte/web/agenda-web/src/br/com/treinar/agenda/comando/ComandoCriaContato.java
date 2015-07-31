package br.com.treinar.agenda.comando;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.Contato;
import br.com.treinar.agenda.Database;
import br.com.treinar.agenda.Pessoa;
import br.com.treinar.agenda.Telefone;
import br.com.treinar.agenda.TipoTelefone;
import br.com.treinar.agenda.exceptions.AgendaException;

public class ComandoCriaContato implements Comando {

	@Override
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws AgendaException, Exception {
		
		
		String nomePessoa = request.getParameter("nome");
		
		validarContatoRepetido(nomePessoa);

		String dataNascimento = request.getParameter("dataNascimento");
		String dddTelefone = request.getParameter("dddTelefone");
		String numeroTelefone = request.getParameter("numeroTelefone");
		
		Contato contato = new Contato();
		contato.setDataCadastro(new Date());
		contato.setPessoa(new Pessoa());
		contato.getPessoa().setNome(nomePessoa);
		Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(dataNascimento);
		contato.getPessoa().setDataNascimento(parse);
		contato.setTelefones(new ArrayList<Telefone>());
		Telefone t = new Telefone();
		t.setDdd(Integer.parseInt(dddTelefone));
		t.setNumero(Integer.parseInt(numeroTelefone));
		String ordinalTipoTelefone = request.getParameter("tipoTelefone");
		t.setTipoTelefone(TipoTelefone.values()[Integer.parseInt(ordinalTipoTelefone)]);
		contato.getTelefones().add(t);
		Database.getInstance().getContatos().add(contato);
	
		request.setAttribute("contato", contato);
		
		ComandoListaContato list = new ComandoListaContato();
		String retorno = list.executar(request, response);
		
		return retorno;
	}

	private void validarContatoRepetido(String nomePessoa) throws AgendaException {
		List<Contato> contatos = Database.getInstance().getContatos();
		Boolean repetido = Boolean.FALSE;
		AgendaException agendaException = null;
		for (Contato contato : contatos) {
			if (contato.getPessoa().getNome().equalsIgnoreCase(nomePessoa)) {
				repetido = Boolean.TRUE;
				agendaException = new AgendaException();
				agendaException.setChave(nomePessoa + " Já cadastrado");
				agendaException.setPage("/paginas/novo-contato.jsp");
				break;
			}
		}
		if (repetido) {
			throw agendaException;
		}
		
	}

}
