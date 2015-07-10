package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;

public class ContaInvestimento extends Conta {

	private Integer rentabilidade;

	private Double taxaManutencao;

	public Integer getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(Integer rentabilidade) {
		this.rentabilidade = rentabilidade;
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	@Override
	public Boolean sacar(Double valor) {
		Boolean saqueEfetuado = Boolean.FALSE;
		Double saldo = getSaldo();
		if (saldo >= valor + 10) {
			setSaldo(saldo - (valor + 10));
			saqueEfetuado = Boolean.TRUE;
		}
		return saqueEfetuado;
	}

	@Override
	public Double recuperarSaldo() {
		return getSaldo();
	}

}
