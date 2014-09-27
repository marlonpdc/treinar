package br.com.bancodobrasil.modelo;

import br.com.bancodobrasil.modelo.banco.Conta;
import br.com.bancodobrasil.modelo.banco.IPagavel;

public class ContaCorrente extends Conta implements IPagavel {

	public Pacote pacote;
	public Double limiteCredito;

	@Override
	public Boolean sacar(Double valorSacado) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valorSacado) {
			saldo = saldo - (valorSacado + 1);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	@Override
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}

	@Override
	public void tributar() {
		saldo -= pacote.tarifa;
	}
	
	
}
