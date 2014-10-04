package br.com.treinar.bb;

import br.com.treinar.bb.banco.Conta;

public class ContaPoupanca extends Conta {

	public Double taxaRendimento;

	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valor) {
			saldo = saldo - valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

}
