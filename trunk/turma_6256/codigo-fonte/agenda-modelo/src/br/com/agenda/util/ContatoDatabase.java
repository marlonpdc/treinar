package br.com.agenda.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.agenda.modelo.Contato;
import br.com.agenda.modelo.Pessoa;
import br.com.agenda.modelo.Telefone;
import br.com.agenda.modelo.TipoTelefone;

public class ContatoDatabase {

	private List<Contato> contatos;
	private static ContatoDatabase instance;
	
	private ContatoDatabase() {
		contatos = new ArrayList<Contato>();
		moc();
	}
	
	static {
		instance = new ContatoDatabase();
	}
	
	public static ContatoDatabase getInstance() {
		return instance;
	}
	
	private void moc() {
		
		Contato c1 = new Contato();
		c1.setEmail("teste_01@gmail.com");
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Contato01");
		p1.setDataNascimento(new Date());
		c1.setPessoa(p1);
		
		Telefone t1 = new Telefone();
		t1.setDdd(031);
		t1.setNumero(33333);
		t1.setTipo(TipoTelefone.CELULAR);
		c1.setTelefone(t1);
		
		contatos.add(c1);
		
		Contato c2 = new Contato();
		c2.setEmail("teste_02@gmail.com");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Contato02");
		p2.setDataNascimento(new Date());
		c2.setPessoa(p2);
		
		Telefone t2 = new Telefone();
		t2.setDdd(011);
		t2.setNumero(444444);
		t2.setTipo(TipoTelefone.RESIDENCIAL);
		c2.setTelefone(t2);
		contatos.add(c2);
		
	
	}

	public List<Contato> getContatos() {
		return contatos;
	}
	
}
