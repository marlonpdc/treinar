package br.com.bancodobrasil.teste;

import java.util.Scanner;

import br.com.bancodobrasil.modelo.Cliente;
import br.com.bancodobrasil.modelo.ContaCorrente;
import br.com.bancodobrasil.modelo.ContaInvestimento;
import br.com.bancodobrasil.modelo.ContaPoupanca;
import br.com.bancodobrasil.modelo.banco.Conta;

public class TesteArrayPolimorfismo {
	
	static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		Conta contas[] = new Conta[5];
		Integer opcao = null;
		Integer conta = null;
		Double valor = null;
		for (int i = 0; i < contas.length; i++) {
			System.out.println("Digite\n[1] - Conta Corrente"
									 + "[2] - Conta Poupança"
									 + "[3] = Conta Investimento");
			opcao = leitor.nextInt();
			leitor.nextLine();
			switch (opcao) {
			case 1:
				contas[i] = new ContaCorrente();
				criarConta(contas[i]);
				((ContaCorrente)contas[i]).limiteCredito = 0d;
				break;
			case 2:
				contas[i] = new ContaPoupanca();
				criarConta(contas[i]);
				break;
			case 3:
				contas[i] = new ContaInvestimento();
				criarConta(contas[i]);
				break;

			default:
				break;
			}
			
		}
		
		
		do {
			
			System.out.print("Digite 1 - Depositar 2 - Sacar 0 - Sair: ");
			opcao = leitor.nextInt();
			if (opcao != 0) {
				leitor.nextLine();
				System.out.print("Digite a posição da conta: ");
				conta = leitor.nextInt();
				leitor.nextLine();
				System.out.print("Digite o valor: ");
				valor = leitor.nextDouble();
				leitor.nextLine();				
			}
			
			switch (opcao) {
			case 1:
				contas[conta].depositar(valor);
				break;
			case 2:
				contas[conta].sacar(valor);				
				break;

			default:
				break;
			}
		} while (opcao != 0);
		
		for (int i = 0; i < contas.length; i++) {
			System.out.println("Saldo: " + contas[i].recuperarSaldo());
		}
		
		leitor.close();
	}

	private static void criarConta(Conta conta) {
		System.out.print("Informe o numero da conta: ");
		conta.numeroConta = leitor.nextLong();
		leitor.nextLine();
		conta.proprietario = new Cliente();
		System.out.print("Informe o nome do Proprietário: ");
		conta.proprietario.nome = leitor.nextLine();
		System.out.print("Informe o CPF do Proprietário: ");
		conta.proprietario.cpf = leitor.nextLong();
		leitor.nextLine();
		System.out.print("Valor depositado: ");
		conta.depositar(leitor.nextDouble());
	}
}
