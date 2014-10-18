package br.com.treinar.bb;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.banco.ICaptalizavel;
import br.com.treinar.bb.banco.ITributavel;

public class ContaInvestimento extends Conta implements ICaptalizavel, ITributavel {
	
	private static final long serialVersionUID = 1L;

	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valor) {
			saldo = saldo - valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
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

}