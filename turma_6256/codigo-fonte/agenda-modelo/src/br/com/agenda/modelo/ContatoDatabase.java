package br.com.agenda.modelo;

import java.util.ArrayList;
import java.util.List;

public class ContatoDatabase {

	private List<Contato> contatos;
	private static ContatoDatabase instance;
	
	private ContatoDatabase() {
		contatos = new ArrayList<Contato>();
	}
	
	static {
		instance = new ContatoDatabase();
	}
	
	public static ContatoDatabase getInstance() {
		return instance;
	}

	public List<Contato> getContatos() {
		return contatos;
	}
	
}
