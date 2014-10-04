package br.com.treinar.bb.dado;

import br.com.treinar.bb.banco.Conta;

public class BaseDados {

	private static BaseDados instance;
	public Conta conta;
	
	private BaseDados() {
		super();
	}
	
	static {
		instance = new BaseDados();
	}
	
	public static BaseDados getInstance() {
		return instance;
	}
	
	
	
}
