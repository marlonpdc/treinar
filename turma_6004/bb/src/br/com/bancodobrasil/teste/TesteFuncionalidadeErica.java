package br.com.bancodobrasil.teste;

import br.com.bancodobrasil.modelo.banco.Conta;

public class TesteFuncionalidadeErica {

	public static void main(String[] args) {
		Conta conta0 = new Conta();
		Conta conta1 = new Conta(500);
		Conta conta2 = new Conta(500, 1L);
		conta1.depositar(500d);
		double saldo = conta1.recuperarSaldo();
		System.out.println(saldo);
	
	}

}
