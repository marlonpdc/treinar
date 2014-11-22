package br.com.treinar.agenda.util;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.agenda.modelo.Contato;

public class DataBase {

	private List<Contato> contatos;
	
	private static DataBase instance;
	
	static {
		instance = new DataBase();
	}
	
	private DataBase() {
		contatos = new ArrayList<>();
	}

	public static DataBase getInstance() {
		return instance;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
}
