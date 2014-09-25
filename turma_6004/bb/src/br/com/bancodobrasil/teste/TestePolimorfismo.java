package br.com.bancodobrasil.teste;

import br.com.bancodobrasil.modelo.ContaCorrente;
import br.com.bancodobrasil.modelo.ContaPoupanca;
import br.com.bancodobrasil.modelo.banco.Conta;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		c.depositar(100d);
		c.sacar(50d);
		System.out.println("sacou da conta Corrente" );
		
		c = new ContaPoupanca();
		c.depositar(100d);
		c.sacar(50d);
		System.out.println("sacou da conta Poupança");
		
	}
	
}
