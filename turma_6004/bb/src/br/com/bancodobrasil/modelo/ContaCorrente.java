package br.com.bancodobrasil.modelo;

import br.com.bancodobrasil.modelo.banco.Conta;

public class ContaCorrente extends Conta {

	public Pacote pacote;

	@Override
	public Boolean sacar(Double valorSacado) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valorSacado) {
			saldo = saldo - (valorSacado + 1);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}
	
	
}
