package br.com.bancodobrasil.modelo;

import br.com.bancodobrasil.modelo.banco.Conta;
import br.com.bancodobrasil.modelo.banco.ICaptalizavel;

public class ContaPoupanca extends Conta implements ICaptalizavel {
	
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

	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	@Override
	public void captalizar() {
		saldo *= taxaRendimento;
	}
	
}
