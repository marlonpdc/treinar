package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;

public class ContaCorrente extends Conta {

	private double taxaManutencao;
	private double limiteCredito;

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public Boolean sacar(Double valor) {
		boolean saqueEfetuado = Boolean.FALSE;
		double saldo = getSaldo();
		if (saldo >= valor + 1) {
			setSaldo(saldo - (valor + 1));
			saqueEfetuado = Boolean.TRUE;
		}
		return saqueEfetuado;
	}

	@Override
	public Double recuperarSaldo() {
		return getSaldo() + limiteCredito;
	}

}
