package br.com.treinar.agenda;

import br.com.treinar.agenda.Contato;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Database implements Serializable {

	private static final long serialVersionUID = 1L;

	private static Database database;
	private List<Contato> contatos;	
	
	static {
		database = new Database();
	}
	
	private Database() {
		contatos = new ArrayList<Contato>();
		moc();
	}
	
	public static Database getInstance() {
		return database;
	}

	public List<Contato> getContatos() {
		return contatos;
	}
	
	private void moc() {
		Contato c = new Contato();
		c.setPessoa(new Pessoa());
		c.getPessoa().setNome("Gleidaon");
		c.getPessoa().setDataNascimento(new Date());
		c.setDataCadastro(new Date());
		c.setTelefones(new ArrayList<Telefone>());
		Telefone telefone = new Telefone();
		telefone.setDdd(31);
		telefone.setNumero(87749131);
		telefone.setTipoTelefone(TipoTelefone.CELULAR);
		c.getTelefones().add(telefone);
		contatos.add(c);
	}
}
