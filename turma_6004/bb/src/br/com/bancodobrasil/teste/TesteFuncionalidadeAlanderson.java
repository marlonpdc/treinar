package br.com.bancodobrasil.teste;

import java.util.Scanner;

import br.com.bancodobrasil.modelo.banco.Conta;

public class TesteFuncionalidadeAlanderson {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Informe o valor a ser depositado: ");
		double valor = input.nextDouble();
		
		conta.depositar(valor);
		conta.depositar(235.56);
		
		double saldoNovo = conta.recuperarSaldo();
		System.out.println(saldoNovo);
		
	}
}
