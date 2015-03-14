package br.com.treinar.itau.util;

import br.com.treinar.itau.modelo.principal.Conta;

public class ItauUtil extends Object {

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
		Conta conta = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].numeroConta.equals(numeroConta)) {
				conta = contas[i];
				break;
			}
		}
		return conta;
	}
	
	public Conta[] recuperar() {
		return contas;
	}
	
	public void remover(Conta conta) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].equals(conta)) {
				contas[i] = null;
				break;
			}
		}
	}
	
}
