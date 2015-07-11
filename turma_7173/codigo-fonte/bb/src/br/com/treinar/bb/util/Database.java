package br.com.treinar.bb.util;

import br.com.treinar.bb.modelo.banco.Conta;

public class Database {

	private static Database database;
	private Conta[] contas;
	private Integer indice;

	private Database() {
		super();
		indice = 0;
		contas = new Conta[10];
	}

	static {
		database = new Database();
	}

	public static Database getInstance() {
		return database;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}
	
	public Boolean inserirConta(Conta conta) {
		Boolean adicionou = Boolean.FALSE;
		if (indice < contas.length) {
			contas[indice++] = conta;
			adicionou = Boolean.TRUE;
		}
		return adicionou;
	}

	public Conta selecionar(Long codigoConta) {
		Conta c = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].getCodigoConta().equals(codigoConta)) {
				c = contas[i];
				break;
			}
		}
		return c;
	}
	

}
