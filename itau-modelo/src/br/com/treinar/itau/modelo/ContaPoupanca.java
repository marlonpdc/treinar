package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.banco.Conta;
import br.com.treinar.itau.modelo.banco.ICaptalizavel;

public class ContaPoupanca extends Conta implements ICaptalizavel {

	public static Double taxaRendimento;

	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	@Override
	public void captalizar() {
		depositar(recuperarSaldo() * (taxaRendimento / 100));
	}
	
	
}
