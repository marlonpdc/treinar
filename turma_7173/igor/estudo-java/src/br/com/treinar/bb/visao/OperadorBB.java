package br.com.treinar.bb.visao;

import java.util.Scanner;

import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.Conta;

public class OperadorBB {

	private Conta conta;
	Scanner leitor = new Scanner(System.in);
	
	public void init() {
		int opcao = 0;
		do {
			System.out.print("0 - Sair\n"
					+ "1 - Cadastrar Conta\n"
					+ "2 - Exibir dados da Conta\n"
					+ "Op��o: ");
			opcao = leitor.nextInt();
			//importante para remover a quebra de linha]
			//deixada pela leitura de um numero inteiro
			leitor.nextLine();
			switch (opcao) {
			case 1:
				cadastrarConta();
				break;
			case 2:
				exibirDadosConta();
				break;
			case 3:
				
				break;

			default:
				break;
			}
		} while (opcao != 0);
		
	}

	private void exibirDadosConta() {
		System.out.println("Codigo Cliente: " + conta.cliente.codigo);
		System.out.println("Nome Cliente: " + conta.cliente.nome);
		System.out.println("CPF Cliente: " + conta.cliente.cpf);
		System.out.println("Saldo: " + conta.saldo);
	}

	private void cadastrarConta() {
		conta = new Conta();
		System.out.print("Informe o nome do cliente: ");
		String nome = leitor.nextLine();
		System.out.print("Informe o codigo do cliente: ");
		conta.cliente.codigo = leitor.nextLong();
		System.out.print("Informe o CPF do cliente: ");
		long cpf = leitor.nextLong();
		conta.cliente = new Cliente(nome, cpf);
		System.out.print("Saldo inicial: ");
		conta.saldo = leitor.nextDouble();
	}
	
}
