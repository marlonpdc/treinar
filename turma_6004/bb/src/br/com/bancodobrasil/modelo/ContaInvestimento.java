package br.com.bancodobrasil.modelo;

import br.com.bancodobrasil.modelo.banco.Conta;
import br.com.bancodobrasil.modelo.banco.ICaptalizavel;
import br.com.bancodobrasil.modelo.banco.IPagavel;

public class ContaInvestimento extends Conta implements IPagavel, ICaptalizavel {

	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	@Override
	public Boolean sacar(Double valorSacado) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valorSacado) {
			saldo -= valorSacado;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	@Override
	public void captalizar() {
		saldo *= 0.05;
	}

	@Override
	public void tributar() {
		saldo -= 10;
	}

}
