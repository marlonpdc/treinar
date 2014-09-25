package br.com.bancodobrasil.teste;

import br.com.bancodobrasil.modelo.ContaCorrente;
import br.com.bancodobrasil.modelo.banco.Conta;

public class TesteFuncionalidadeErica {

	public static void main(String[] args) {
		Conta conta0 = new ContaCorrente();
		Conta conta1 = new ContaCorrente();
		Conta conta2 = new ContaCorrente();
		conta1.depositar(500d);
		double saldo = conta1.recuperarSaldo();
		System.out.println(saldo);
	
	}

}
