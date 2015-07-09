package br.com.treinar.bb.visao;

import java.util.Scanner;

import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.ContaInvestimento;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.ContaSalario;
import br.com.treinar.bb.modelo.banco.Conta;

public class OperadorBB {

	private Conta conta;
	Scanner leitor = new Scanner(System.in);

	public void init() {
		int opcao = 0;
		do {
			System.out.print(menuPrincipal());
			opcao = leitor.nextInt();
			// importante para remover a quebra de linha]
			// deixada pela leitura de um numero inteiro
			leitor.nextLine();
			switch (opcao) {
			case 1:
				cadastrarConta();
				break;
			case 2:
				exibirDadosConta();
				break;
			case 3:
				efetuarDeposito();
				break;
			case 4:
				realizarSaque();
				break;
			case 5:
				cadastrarTaxaRendimento();
				break;

			default:
				break;
			}
		} while (opcao != 0);

	}

	private void cadastrarTaxaRendimento() {
		System.out.print("Informe a taxa de Rentabilidade: ");
		ContaPoupanca.setTaxaRendimento(leitor.nextInt());
	}

	private void realizarSaque() {

		System.out.print("Valor de saque : ");
		double valor = leitor.nextDouble();
		boolean rolou = conta.sacar(valor);

		if (rolou) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saque nao realizado !");
		}

	}

	private void efetuarDeposito() {
		System.out.print("Deposito de: ");
		double valor = leitor.nextDouble();
		boolean rolou = conta.depositar(valor);
		if (rolou) {
			System.out.println("Depósito efetuado com sucesso!");
		} else {
			System.out.println("Não rolou brother!!!");
		}

		// System.out.println(rolou ? "Depósito efetuado com sucesso!" :
		// "Não rolou brother!!!");

	}

	private void exibirDadosConta() {
		System.out.println("Codigo Cliente: " + conta.getCliente().getCodigo());
		System.out.println("Nome Cliente: " + conta.getCliente().getNome());
		System.out.println("CPF Cliente: " + conta.getCliente().getCpf());
		System.out.println("Saldo: " + conta.recuperarSaldo());
	}

	private void cadastrarConta() {
		System.out.println(menuCadastrarConta());

		int opcao = leitor.nextInt();
		leitor.nextLine();
		switch (opcao) {
		case 1:
			conta = new ContaCorrente();
			cadastrarConta((ContaCorrente) conta);
			break;
		case 2:
			conta = new ContaInvestimento();
			cadastrarConta((ContaInvestimento) conta);
			break;
		case 3:
			conta = new ContaPoupanca();
			cadastrarConta((ContaPoupanca) conta);
			break;
		case 4:
			conta = new ContaSalario();
			cadastrarConta((ContaSalario) conta);
			break;

		default:
			System.out.println("\nTipo de conta Inválido...\n");
			break;
		}

	}

	private void cadastrarConta(ContaSalario conta) {
		cadastrarContaPai(conta);
		System.out.print("Informe a quantidade máxima de saques: ");
		conta.setQtdSaque(leitor.nextInt());

	}

	private void cadastrarConta(ContaPoupanca conta) {
		cadastrarContaPai(conta);
	}

	private void cadastrarConta(ContaInvestimento conta) {
		cadastrarContaPai(conta);
		System.out.print("Informe taxa de Rentabilidade: ");
		conta.setRentabilidade(leitor.nextInt());
		System.out.print("Informe a taxa de manunteção: ");
		conta.setTaxaManutencao(leitor.nextDouble());

	}

	private void cadastrarConta(ContaCorrente conta) {
		cadastrarContaPai(conta);
		System.out.print("Informe taxa de manutenção: ");
		conta.setTaxaManutencao(leitor.nextDouble());
		System.out.print("Informe o codigo do cliente: ");
		conta.setLimiteCredito(leitor.nextDouble());
	}

	private void cadastrarContaPai(Conta conta) {
		System.out.print("Informe o nome do cliente: ");
		String nome = leitor.nextLine();
		System.out.print("Informe o CPF do cliente: ");
		long cpf = leitor.nextLong();
		conta.setCliente(new Cliente(nome, cpf));
		System.out.print("Informe o codigo do cliente: ");
		conta.getCliente().setCodigo(leitor.nextLong());
		System.out.print("Saldo inicial: ");
		conta.depositar(leitor.nextDouble());
	}

	private String menuPrincipal() {
		return "0 - Sair\n" 
				+ "1 - Cadastrar Conta\n"
				+ "2 - Exibir dados da Conta\n" 
				+ "3 - Depositar na Conta\n"
				+ "4 - Realizar Saque\n" 
				+ "5 - Cadastrar taxa de rendimento\n" 
				+ "Opção: ";
	}

	private String menuCadastrarConta() {
		return "\t1 - Conta Corrente\n\t" + "2 - Conta Investimento\n\t"
				+ "3 - Conta Poupança\n\t" + "4 - Conta Salário\n\t"
				+ "Informe: ";
	}

}
