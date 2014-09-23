package br.com.bancodobrasil.teste;

import br.com.bancodobrasil.modelo.Conta;

public class TesteFuncionalidadeErica {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(500);
		double saldo = conta.recuperarSaldo();
		System.out.println(saldo);
	
	}

}
