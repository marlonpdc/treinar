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
	public boolean sacar(double valor) {
		boolean saqueEfetuado = false;
		double saldo = getSaldo();
		if (saldo >= valor + 1) {
			setSaldo(saldo - (valor + 1));
			saqueEfetuado = true;
		}
		return saqueEfetuado;
	}

	@Override
	public double recuperarSaldo() {
		return getSaldo() + limiteCredito;
	}

}
