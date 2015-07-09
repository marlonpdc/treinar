package br.com.treinar.bb.util;

import br.com.treinar.bb.modelo.banco.Conta;

public class Database {

	private static Database database;
	private Conta conta;

	private Database() {
		super();
	}

	static {
		database = new Database();
	}

	public static Database getInstance() {
		return database;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
