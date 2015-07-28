package br.com.treinar.agenda.comando;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.Contato;
import br.com.treinar.agenda.Pessoa;
import br.com.treinar.agenda.Telefone;
import br.com.treinar.agenda.exceptions.AgendaException;

public class ComandoCriaContato implements Comando {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws AgendaException, Exception {
		String nomePessoa = request.getParameter("nome");
		String dataNascimento = request.getParameter("dataNascimento");
		String dddTelefone = request.getParameter("dddTelefone");
		String numeroTelefone = request.getParameter("numeroTelefone");
		
		Contato contato = new Contato();
		contato.setDataCadastro(new Date());
		contato.setPessoa(new Pessoa());
		contato.getPessoa().setNome(nomePessoa);
		Date parse = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
		contato.getPessoa().setDataNascimento(parse);
		contato.setTelefones(new ArrayList<Telefone>());
		Telefone t = new Telefone();
		t.setDdd(Integer.parseInt(dddTelefone));
		t.setNumero(Integer.parseInt(numeroTelefone));
		contato.getTelefones().add(t);
	}

}
