package br.com.treinar.bradesco.teste;

import br.com.treinar.bradesco.ContaPoupanca;
import br.com.treinar.bradesco.banco.Conta;

public class TesteModelo {

	public static void main(String[] args) {
		Conta conta = new ContaPoupanca();
		conta.depositar(100d);
		
		System.out.println(conta.recuperarSaldo());
		
	}
	
}
