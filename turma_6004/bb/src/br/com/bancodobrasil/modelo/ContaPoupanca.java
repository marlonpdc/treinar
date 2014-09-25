package br.com.bancodobrasil.modelo;

import br.com.bancodobrasil.modelo.banco.Conta;

public class ContaPoupanca extends Conta {

	public static Double taxaRendimento;
	
	static {
		taxaRendimento = 0d;
	}

	@Override
	public Boolean sacar(Double valorSacado) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valorSacado) {
			saldo = saldo - valorSacado;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}
	
}
