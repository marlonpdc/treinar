package br.com.treinar.itau.util;

import br.com.treinar.itau.exception.ContaNaoCadastradaException;
import br.com.treinar.itau.modelo.principal.Conta;

public class ItauUtil extends Object {

	private static ItauUtil instance;
	
	public Conta[] contas;
	private Integer index;
	
	private ItauUtil() {
		super();
		index = 0;
		contas = new Conta[3];
	}
	
	static {
		instance = new ItauUtil();		
	}
	
	public static ItauUtil getInstance() {
		return instance;
	}
	
	public void adicionarConta(Conta c) {
		if (index == contas.length) {
			aumentarVetor();
		}
		contas[index++] = c;
	}

	public Conta recuperar(Integer numeroConta) throws ContaNaoCadastradaException {
		Conta conta = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].numeroConta.equals(numeroConta)) {
				conta = contas[i];
				break;
			}
		}
		if (conta == null) {
			throw new ContaNaoCadastradaException();
		}
		return conta;
	}
	
	public Conta[] recuperar() {
		return contas;
	}
	
	public void remover(Conta conta) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].equals(conta)) {
//				if (contas.length - 1 == i) {
//					contas[i] = null;								
//				} else if(contas.length - 2 == i) {					
//					contas[contas.length - 2] = contas[contas.length - 1];								
//					contas[contas.length - 1] = null;								
//				} else {
//					for (int j = i + 1; j < index; j++) {
//						contas[i] = contas[j];					
//					}					
//				}
				contas[i] = null;
				realocar();
				break;
			}
		}
	}

	private void realocar() {
		Conta contasTemp[] = new Conta[contas.length];
		int j = 0;
		
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				contasTemp[j++] = contas[i];
			}
		}
		contas = contasTemp;
		index = j;
	}
	
	private void aumentarVetor() {
		Conta contasTemp[] = new Conta[contas.length * 2];
		for (int i = 0; i < contas.length; i++) {
			contasTemp[i] = contas[i];
		}
		contas = contasTemp;
	}
}
