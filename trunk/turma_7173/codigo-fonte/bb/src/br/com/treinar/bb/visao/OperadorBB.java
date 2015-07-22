package br.com.treinar.bb.visao;

import java.util.Scanner;

import br.com.treinar.bb.controle.ContaControle;
import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.ContaInvestimento;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.ContaSalario;
import br.com.treinar.bb.modelo.SituacaoConta;
import br.com.treinar.bb.modelo.banco.BBException;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ContaBloqueadaException;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;

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
			case 10:
				editarConta();
				break;
			case 0:
				controle.finalizar();
				leitor.close();
				break;

			default:
				break;
			}
		} while (opcao != 0);

	}

	private void editarConta() {
		Conta conta;
		try {
			conta = recuperarConta();
			if (conta instanceof ContaCorrente) {
				editarConta((ContaCorrente) conta);
			} else if (conta instanceof ContaPoupanca) {
				editarConta((ContaPoupanca) conta);
			} else if (conta instanceof ContaSalario) {
				editarConta((ContaSalario) conta);
			} else if (conta instanceof ContaInvestimento) {
				editarConta((ContaInvestimento) conta);
			}
		} catch (BBException e) {
			System.out.println("Deposito não efetuado!!!");
		}
	}

	private void editarConta(ContaInvestimento conta) {
		
	}

	private void editarConta(ContaSalario conta) {
		// TODO Auto-generated method stub
		
	}

	private void editarConta(ContaPoupanca conta) {
		// TODO Auto-generated method stub
		
	}

	private void editarConta(ContaCorrente conta) {
		System.out.println("\n");
		System.out.println("Conta Codigo: " + conta.getCodigoConta());
		System.out.println("Situação: " + conta.getSituacao().getDescricao());
		System.out.println("Taxa Manutenção: " + conta.getTaxaManutencao());
		System.out.println("Limite de Crédito: " + conta.getLimiteCredito());
		System.out.println("\n");
		System.out.print("Nova taxa de manutencão: ");
		conta.setTaxaManutencao(leitor.nextDouble());
		System.out.print("Novo limite de Crédito: ");
		conta.setLimiteCredito(leitor.nextDouble());
		System.out.print("Situação: ");
		conta.setSituacao(SituacaoConta.recuperarSituacaoPorOrdinal(leitor.nextInt()));
		try {
			controle.editar(conta);
		} catch (BBException e) {
			System.err.println("erro ao editar a conta");
		}
	}

	private void listarContas() {
		try {
			System.out.println(exibirContas());
		} catch (BBException e) {
			System.err.println(e.getCodigoErroNegocio());
		}
	}

	private void cadastrarTaxaRendimento() {
		System.out.print("Informe a taxa de Rentabilidade: ");
		ContaPoupanca.setTaxaRendimento(leitor.nextInt());
	}

	private void realizarSaque() {

		Conta conta;
		try {
			conta = recuperarConta();
			System.out.print("Valor de saque : ");
			Double valor = leitor.nextDouble();
			
			try {
				controle.efetuarSaque(conta, valor);
				System.out.println("Saque efetuado com sucesso!");
			} catch (SaldoInsuficienteException e) {
				System.out.println("Saque nao realizado LIMITE!");
			} catch (ContaBloqueadaException e) {
				System.out.println("Saque nao realizado BLOQUEIO!");
			} catch (BBException e) {
				System.out.println(e.getCodigoErroNegocio());
			}
		} catch (BBException e) {
			System.err.println(e.getCodigoErroNegocio());
		}


	}

	private void efetuarDeposito() {
		Conta conta;
		try {
			conta = recuperarConta();
			System.out.print("Deposito de: ");
			Double valor = leitor.nextDouble();
			conta.depositar(valor);
			System.out.println("Depósito efetuado com sucesso!");
			/*System.out.println(rolou ? "Depósito efetuado com sucesso!"
					: "Não rolou brother!!!");*/
		} catch (BBException e) {
			System.out.println("Deposito não efetuado!!!");
		}
	}

	private Conta recuperarConta() throws BBException {
		System.out.println(exibirContas());
		System.out.print("Informe o codigo da conta: ");
		return controle.recuperarConta(leitor.nextLong());
	}

	private String exibirContas() throws BBException {
		Conta[] contas;
		contas = controle.recuperarContas();
		StringBuilder contasStr = new StringBuilder();
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				contasStr.append("Conta " + contas[i].getCodigoConta()).append(
						"\n");
			}
		}
		return contasStr.toString();
	}

	private void exibirDadosConta() {
		Conta conta;
		try {
			conta = recuperarConta();
			if (conta != null) {
				System.out.println("Codigo Cliente: "
						+ conta.getCliente().getCodigo());
				System.out.println("Nome Cliente: " + conta.getCliente().getNome());
				System.out.println("CPF Cliente: " + conta.getCliente().getCpf());
				System.out.println("Saldo: " + conta.recuperarSaldo());
			} else {
				System.out.println("Conta não cadastrada");
			}
		} catch (BBException e) {
			System.err.println(e.getCodigoErroNegocio());
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
		try {
			validarCamposObrigatorios(conta);
			controle.gravarConta(conta);
			System.out.println("Conta gravada...");
		} catch (BBException e) {
			System.out.println(e.getCodigoErroNegocio());
		} catch (Exception e) {
			//enviar email com erro e notificar o usuario
		}

	}

	private void validarCamposObrigatorios(Conta conta) throws BBException {
		Boolean valido = Boolean.TRUE;
		StringBuilder campos = new StringBuilder();
		if (conta.getCliente() == null) {
			valido = Boolean.FALSE;
			campos.append("Cliente, ");
		}
		if (conta.getCliente().getNome() == null || conta.getCliente().getNome().isEmpty()) {
			valido = Boolean.FALSE;			
			campos.append("Nome do Cliente, ");
		}
		if (!valido) {
			BBException bbException = new BBException();
			bbException.setCodigoErroNegocio(campos.toString() + "Obrigatorios");
			throw bbException;
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
		System.out.print("Informe o limite de crédito: ");
		conta.setLimiteCredito(leitor.nextDouble());
	}

	private void cadastrarContaPai(Conta conta) {
		try {
			System.out.print("Informe o nome do cliente: ");
			String nome = leitor.nextLine();
			System.out.print("Informe o CPF do cliente: ");
			long cpf = leitor.nextLong();
			conta.setCliente(new Cliente(nome, cpf));
			System.out.print("Informe o codigo do cliente: ");
			conta.getCliente().setCodigo(leitor.nextLong());
			System.out.print("Saldo inicial: ");
			conta.depositar(leitor.nextDouble());
		} catch (BBException e) {
			System.err.println(e.getCodigoErroNegocio());
		}
	}

	private void statusContas() {
		try {
			SituacaoConta[] situacoes = SituacaoConta.values();
			System.out.println("Informe: ");
			for (int i = 0; i < situacoes.length; i++) {
				System.out.println(i + " - " + situacoes[i].getDescricao());
			}
			System.out.print("Opção: ");
			Integer opcao = leitor.nextInt();
			Conta conta = recuperarConta();
			controle.atualizarSituacaoConta(conta, opcao);
		} catch (BBException e) {
			System.err.println(e.getCodigoErroNegocio());
		}

	}

	private String menuPrincipal() {
		return "0 - Sair\n" + "1 - Cadastrar Conta\n"
				+ "2 - Exibir dados da Conta\n" + "3 - Depositar na Conta\n"
				+ "4 - Realizar Saque\n" + "5 - Cadastrar taxa de rendimento\n"
				+ "6 - Captalizar\n" + "7 - Pagar\n" + "8 - Listar Contas\n"
				+ "9 - Gerenciar Status da Conta\n" + "10 - Editar Conta\n" + "Opção: ";
	}

	private String menuCadastrarConta() {
		return "\t1 - Conta Corrente\n\t" + "2 - Conta Investimento\n\t"
				+ "3 - Conta Poupança\n\t" + "4 - Conta Salário\n\t"
				+ "Informe: ";
	}

	private void captalizar() {
		try {
			controle.efetuarCaptalizacao();
		} catch (BBException e) {
			System.err.println(e.getCodigoErroNegocio());
		}
	}

	private void pagar() {
		try {
			controle.efetuarPagamento();
		} catch (BBException e) {
			System.err.println(e.getCodigoErroNegocio());
		}
	}

	@Override
	protected void finalize() throws Throwable {
		leitor.close();
		System.out.println("finalizou....");
		super.finalize();
	}

}
