package br.com.treinar.bb;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.banco.ITributavel;

public class ContaUniversitaria extends Conta implements ITributavel {

	private static final long serialVersionUID = 1L;

	private Double tarifa;
	
	@Override
	public void sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valor) {
			saldo -= valor;
			sacou = Boolean.TRUE;
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
