package br.com.bancodobrasil.modelo;

import br.com.bancodobrasil.modelo.banco.Conta;

public class ContaPoupanca extends Conta {

	public static Double taxaRendimento;
	
	static {
		System.out.println("construtor de static");
		taxaRendimento = 0d;
	}
	
	public ContaPoupanca() {
		System.out.println("construtor de instancia");
	}
	
}
