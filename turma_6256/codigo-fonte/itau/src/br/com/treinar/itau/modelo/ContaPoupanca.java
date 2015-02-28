package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.principal.Conta;

public class ContaPoupanca extends Conta {

	public Float taxaRendimento;
	
	public ContaPoupanca(Integer numeroConta) {
		super(numeroConta);
	}
		
}
