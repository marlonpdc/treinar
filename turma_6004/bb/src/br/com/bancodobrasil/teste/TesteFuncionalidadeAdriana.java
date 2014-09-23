package br.com.bancodobrasil.teste;

import java.util.Scanner;

import br.com.bancodobrasil.modelo.Conta;

public class TesteFuncionalidadeAdriana {
	public static void main(String[] args) {
			
		Conta conta = new Conta();
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor do depósito: ");
		Double valor = leitor.nextDouble();
		
	    conta.depositar(valor);
	    System.out.println(conta.saldo);
	  
	    double saldo = conta.recuperarSaldo();
	    System.out.println(saldo);
	}
}
