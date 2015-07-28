package br.com.treinar.agenda.util;

import br.com.treinar.agenda.Contato;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private static Database database;
	private List<Contato> contatos;	
	
	static {
		database = new Database();
	}
	
	private Database() {
		contatos = new ArrayList<Contato>();
	}
	
	public static Database getInstance() {
		return database;
	}

	public List<Contato> getContatos() {
		return contatos;
	}
	
}
