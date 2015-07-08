package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;

public class ContaInvestimento extends Conta {

	private int rentabilidade;

	private double taxaManutencao;

	public int getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(int rentabilidade) {
		this.rentabilidade = rentabilidade;
	}

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

}
