package br.com.treinar.bb;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.banco.ICaptalizavel;
import br.com.treinar.bb.banco.ITributavel;
import br.com.treinar.bb.exception.SaldoInsuficienteException;

public class ContaInvestimento extends Conta implements ICaptalizavel, ITributavel {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (saldo >= valor) {
			saldo = saldo - valor;
		} else {
			throw new SaldoInsuficienteException();
		}
	}

	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	@Override
	public void tributar() {
		saldo -= 10;
	}

	@Override
	public void captalizar() {
		saldo *= 1.1;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + "ContaInvestimento";
	}

}
