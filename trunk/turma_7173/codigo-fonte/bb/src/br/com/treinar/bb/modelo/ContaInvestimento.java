package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.IPagavel;

public class ContaInvestimento extends Conta implements ICaptalizavel, IPagavel {

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

	@Override
	public String toString() {
		return "ContaInvestimento [rentabilidade=" + rentabilidade
				+ ", taxaManutencao=" + taxaManutencao + super.toString() + "]";
	}
	@Override
	public void captalizar() {
		depositar(getSaldo() * ContaPoupanca.getTaxaRendimento() / 100);
	}
	
	@Override
	public void pagar() {
		sacar(taxaManutencao);
	}
}
