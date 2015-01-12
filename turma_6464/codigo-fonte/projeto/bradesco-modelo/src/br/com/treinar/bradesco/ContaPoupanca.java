package br.com.treinar.bradesco;

import br.com.treinar.bradesco.banco.Conta;

public class ContaPoupanca extends Conta {

	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	
	
}
