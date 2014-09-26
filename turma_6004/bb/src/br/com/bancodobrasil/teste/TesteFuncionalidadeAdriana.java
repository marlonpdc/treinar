package br.com.bancodobrasil.teste;

import java.util.Scanner;

import br.com.bancodobrasil.modelo.ContaCorrente;
import br.com.bancodobrasil.modelo.banco.Conta;

public class TesteFuncionalidadeAdriana {
	public static void main(String[] args) {
			
		Conta conta = new ContaCorrente();
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o valor do depósito: ");
		Double valor = leitor.nextDouble();
		
	    conta.depositar(valor);
	    System.out.println(conta.recuperarSaldo());
	  
	    double saldo = conta.recuperarSaldo();
	    System.out.println(saldo);
	}
}
