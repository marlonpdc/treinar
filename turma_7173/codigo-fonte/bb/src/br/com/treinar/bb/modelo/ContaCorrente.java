package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.IPagavel;

public class ContaCorrente extends Conta implements IPagavel {

	private Double taxaManutencao;
	private Double limiteCredito;

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
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

	@Override
	public String toString() {
		return "ContaCorrente [taxaManutencao=" + taxaManutencao
				+ ", limiteCredito=" + limiteCredito + super.toString() + "]";
	}

	@Override
	public void pagar() {
		setSaldo(getSaldo() - taxaManutencao);
	}
}
