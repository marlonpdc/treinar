package br.com.treinar.bb.visao;

import java.util.Scanner;

import br.com.treinar.bb.controle.ContaControle;
import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.ContaInvestimento;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.ContaSalario;
import br.com.treinar.bb.modelo.SituacaoConta;
import br.com.treinar.bb.modelo.banco.Conta;

public class OperadorBB {

	private Scanner leitor;
	private ContaControle controle;
	
	public OperadorBB() {
		leitor = new Scanner(System.in);
		controle = new ContaControle();
	}

	public void init() {
		Integer opcao = 0;
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
			case 6:
				captalizar();
				break;
			case 7:
				pagar();
				break;
			case 8:
				listarContas();
				break;
			case 9:
				statusContas();
				break;

			default:
				break;
			}
		} while (opcao != 0);

	}

	private void listarContas() {
		System.out.println(exibirContas());
	}

	private void cadastrarTaxaRendimento() {
		System.out.print("Informe a taxa de Rentabilidade: ");
		ContaPoupanca.setTaxaRendimento(leitor.nextInt());
	}

	private void realizarSaque() {

		Conta conta = recuperarConta();
		
		System.out.print("Valor de saque : ");
		Double valor = leitor.nextDouble();
		Boolean rolou = conta.sacar(valor);

		if (rolou) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saque nao realizado !");
		}

	}

	private void efetuarDeposito() {
		Conta conta = recuperarConta();

		System.out.print("Deposito de: ");
		Double valor = leitor.nextDouble();
		Boolean rolou = conta.depositar(valor);
		if (rolou) {
			System.out.println("Depósito efetuado com sucesso!");
		} else {
			System.out.println("Não rolou brother!!!");
		}

		System.out.println(rolou ? "Depósito efetuado com sucesso!" :
		"Não rolou brother!!!");

	}

	private Conta recuperarConta() {
		System.out.println(exibirContas());
		System.out.print("Informe o codigo da conta: ");
		return controle.recuperarConta(leitor.nextLong());
	}

	private String exibirContas() {
		Conta[] contas = controle.recuperarContas();
		StringBuilder contasStr = new StringBuilder();
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				contasStr.append("Conta " + contas[i].getCodigoConta()).append("\n");
			}
		}
		return contasStr.toString();
	}

	private void exibirDadosConta() {
		Conta conta = recuperarConta();
		if (conta != null) {
			System.out.println("Codigo Cliente: " + conta.getCliente().getCodigo());
			System.out.println("Nome Cliente: " + conta.getCliente().getNome());
			System.out.println("CPF Cliente: " + conta.getCliente().getCpf());
			System.out.println("Saldo: " + conta.recuperarSaldo());			
		} else {
			System.out.println("Conta não cadastrada");
		}
	}

	private void cadastrarConta() {
		System.out.print(menuCadastrarConta());
		Conta conta = null;
		Integer opcao = leitor.nextInt();
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
		Boolean gravou = controle.gravarConta(conta);
		System.out.println(gravou ? "Conta gravada..." : "Conta não gravada");

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
		System.out.print("Informe o limite de crédito: ");
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
	
	private void statusContas() {
		SituacaoConta[] situacoes = SituacaoConta.values();
		System.out.println("Informe: ");
		for (int i = 0; i < situacoes.length; i++) {
			System.out.println(i + " - " + situacoes[i].getDescricao());
		}
		System.out.print("Opção: ");
		Integer opcao = leitor.nextInt();
		Conta conta = recuperarConta();
		controle.atualizarSituacaoConta(conta, opcao);
		
	}

	private String menuPrincipal() {
		return "0 - Sair\n" 
				+ "1 - Cadastrar Conta\n"
				+ "2 - Exibir dados da Conta\n" 
				+ "3 - Depositar na Conta\n"
				+ "4 - Realizar Saque\n" 
				+ "5 - Cadastrar taxa de rendimento\n" 
				+ "6 - Captalizar\n" 
				+ "7 - Pagar\n" 
				+ "8 - Listar Contas\n"
				+ "9 - Gerenciar Status da Conta" 
				+ "Opção: ";
	}

	private String menuCadastrarConta() {
		return "\t1 - Conta Corrente\n\t" + "2 - Conta Investimento\n\t"
				+ "3 - Conta Poupança\n\t" + "4 - Conta Salário\n\t"
				+ "Informe: ";
	}

	private void captalizar() {
		controle.efetuarCaptalizacao();
	}
	
	private void pagar() {
		controle.efetuarPagamento();
	}
	
}
