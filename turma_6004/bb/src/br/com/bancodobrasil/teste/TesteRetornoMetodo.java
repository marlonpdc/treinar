package br.com.bancodobrasil.teste;

import br.com.bancodobrasil.modelo.banco.Conta;


public class TesteRetornoMetodo {

	public static void main(String[] args) {
		Metodo metodo = new Metodo();
		metodo.variavel = "variavel ";
		String atr = metodo.variavel;
		System.out.println(atr);
		metodo.metodoUm();
		String palavra = metodo.metodoDois();
		
		System.out.println(palavra);
		Conta c = new Conta();
		metodo.metodoTres(c);
		double saldo = c.recuperarSaldo();
		System.out.println(saldo);
	}
	
}
