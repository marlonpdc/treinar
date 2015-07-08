package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;

public class ContaPoupanca extends Conta {

	private int taxaRendimento;

	public int getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(int taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
}
