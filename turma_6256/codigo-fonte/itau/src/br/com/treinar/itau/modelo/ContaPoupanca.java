package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.principal.Conta;

public class ContaPoupanca extends Conta {

	public static Float taxaRendimento;
	
	static {
		taxaRendimento = Float.valueOf(19);
	}
	
		
	public static Float getTaxaRendimento() {
		return taxaRendimento;
	}



	public static void setTaxaRendimento(Float taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}



	public ContaPoupanca(Integer numeroConta) {
		super(numeroConta);
	}
		
}
