package br.com.treinar.itau.util;

import br.com.treinar.itau.modelo.principal.Conta;

public class ItauUtil {

	private static ItauUtil instance;
	
	public Conta[] contas;
	private Integer index;
	
	private ItauUtil() {
		super();
		index = 0;
		contas = new Conta[5];
	}
	
	static {
		instance = new ItauUtil();		
	}
	
	public static ItauUtil getInstance() {
		return instance;
	}
	
	public void adicionarConta(Conta c) {
		contas[index++] = c;
	}

	public Conta recuperar(Integer numeroConta) {
		return null;
	}
	
}
