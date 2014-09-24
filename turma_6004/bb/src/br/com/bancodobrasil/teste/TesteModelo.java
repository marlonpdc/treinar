package br.com.bancodobrasil.teste;

import java.util.Date;

import br.com.bancodobrasil.modelo.Cliente;
import br.com.bancodobrasil.modelo.banco.Conta;

public class TesteModelo {

	public static void main(String[] args) {
		Conta conta = new Conta(1000);
		conta.numeroConta = 10481L;
		conta.saldo = 2.5;
		conta.proprietario = new Cliente();
		conta.proprietario.nome = "Érica";
		conta.proprietario.cpf = 55546265302L;
		conta.proprietario.dataNascimento = new Date();
		
		System.out.println(conta.numeroConta);
		System.out.println(conta.saldo);
		System.out.println(conta.proprietario.nome);
		System.out.println(conta.proprietario.cpf);
		System.out.println(conta.proprietario.dataNascimento);
		
	}
	
}
