package br.com.treinar.bb;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.banco.ITributavel;
import br.com.treinar.bb.exception.BBException;
import br.com.treinar.bb.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements ITributavel {

	private static final long serialVersionUID = 1L;
	private Double tarifa;
	private Double limiteCredito;
	
	@Override
	public Double recuperarSaldo() throws BBException {
		return saldo + limiteCredito;
	}

	//esta implementacao exige um if para avaliar a execucao da operacao
	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (saldo >= (valor + limiteCredito)) {
			if (saldo >= valor) {
				saldo -= valor;
			} else {
				limiteCredito -= valor;
				saldo = 0d;
			}
		} else {
			throw new SaldoInsuficienteException();
		}
	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		if (limiteCredito != null && limiteCredito < 10000) {
			this.limiteCredito = limiteCredito;			
		}
	}

	@Override
	public void tributar() {
		saldo -= tarifa;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + "ContaCorrente [tarifa=" + tarifa + ", limiteCredito="
				+ limiteCredito + "]";
	}
	
	

}
