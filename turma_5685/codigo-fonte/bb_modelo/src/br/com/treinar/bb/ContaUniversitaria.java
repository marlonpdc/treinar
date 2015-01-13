package br.com.treinar.bb;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.banco.ITributavel;
import br.com.treinar.bb.exception.SaldoInsuficienteException;

public class ContaUniversitaria extends Conta implements ITributavel {

	private static final long serialVersionUID = 1L;

	private Double tarifa;
	
	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			throw new SaldoInsuficienteException();
		}
	}

	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public void tributar() {
		saldo -= tarifa;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + "ContaUniversitaria [tarifa=" + tarifa + "]";
	}

}
