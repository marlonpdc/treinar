package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.BBException;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ContaBloqueadaException;
import br.com.treinar.bb.modelo.banco.IPagavel;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements IPagavel {

	private static final long serialVersionUID = 1L;

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
	public void sacar(Double valor) 
			throws SaldoInsuficienteException, 
				   ContaBloqueadaException,
				   BBException {
		double saldo = getSaldo();
		if (saldo >= valor + 1) {
			setSaldo(saldo - (valor + 1));
		} else {
			SaldoInsuficienteException excecao = new SaldoInsuficienteException();
			throw excecao;
		}
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
