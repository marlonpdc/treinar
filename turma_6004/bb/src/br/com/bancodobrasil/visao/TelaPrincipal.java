package br.com.bancodobrasil.visao;

import javax.swing.JOptionPane;

import br.com.bancodobrasil.modelo.Cliente;
import br.com.bancodobrasil.modelo.ContaCorrente;
import br.com.bancodobrasil.modelo.ContaInvestimento;
import br.com.bancodobrasil.modelo.ContaPoupanca;
import br.com.bancodobrasil.modelo.Pacote;
import br.com.bancodobrasil.modelo.banco.Conta;
import br.com.bancodobrasil.util.BBUtil;

public class TelaPrincipal {
	
	public void init() {
		Conta c = null;
		Integer opcao = -1;
		
		do {
			String msg = "Bem vindos ao " + BBUtil.nomeBanco + "\n"
					+ "Digite:\n"
					+ "1 - Criar Conta\n"
					+ "2 - Depositar\n"
					+ "3 - Exibir Saldo\n"
					+ "4 - Sacar\n"
					+ "5 - Exibir Dados\n"
					+ "6 - Cadastrar Taxa Rendimento\n"
					+ "7 - Exibir Taxa Rendimento\n"
					+ "0 - Sair";
			String opcaoStr = JOptionPane.showInputDialog(msg);
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 1:
				c = criarConta();
				break;
			case 2:
				depositar(c);
				break;
			case 3:
				exibirSaldo(c);
				break;
			case 4:
				sacar(c);
				break;
			case 5:
				exibirDados(c);
				break;
			case 6:
				cadastrarTaxaRendimento();
				break;
			case 7:
				exibirTaxaRendimento();
				break;
			case 0:
				System.out.println("opcao sair 0");
				break;
			default:
				System.out.println("opcao errada");
				break;
			}
			
			
		} while (opcao != 0);
		
	}

	private Conta criarConta() {
		Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Corrente\n"
										  + "2 - Poupanca\n"
										  + "3 - Investimento"));
		Conta c = null;
		switch (opcao) {
		case 1:
			c = criarContaCorrente();
			break;
		case 2:
			c = criarContaPoupanca();
			break;
		case 3:
			c = criarContaInvestimento();
			break;

		default:
			break;
		}
		return c;
	}

	private void exibirTaxaRendimento() {
		Double taxaRendimento = ContaPoupanca.taxaRendimento;
		JOptionPane.showMessageDialog(null,"Taxa de Rendimento: " + taxaRendimento);
	}

	private void cadastrarTaxaRendimento() {
		String taxaRendimentoStr = JOptionPane.showInputDialog("Informe a taxa de Rendimento: ");
		Double taxaRendimento = Double.parseDouble(taxaRendimentoStr);
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	private void exibirDados(Conta c) {
		String dados = "Numero: " + c.numeroConta + "\ncpf: " + c.proprietario.cpf + "\nnome:" + c.proprietario.nome + "\nsaldo" + c.recuperarSaldo();
		if (c instanceof ContaCorrente) {
			dados += "\nTarifa: " + ((ContaCorrente)c).pacote.tarifa + "\nConta Corrente";
		}else if (c instanceof ContaPoupanca) {
			dados += "\nTaxa de Rendimento: " + ContaPoupanca.taxaRendimento + "\nConta Poupança";
		}
		JOptionPane.showMessageDialog(null, dados);
	}

	private void sacar(Conta c) {
		String valorSacadoStr = JOptionPane.showInputDialog("Valor a ser sacado");
		Double valorSacado = Double.parseDouble(valorSacadoStr);
		Boolean sacou = c.sacar(valorSacado);
		if (sacou) {
			JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Saque não efetuado");
		}
	}

	private void exibirSaldo(Conta c) {
		Double saldo = c.recuperarSaldo();
		JOptionPane.showMessageDialog(null,"Saldo: " + saldo);
	}

	private void depositar(Conta c) {
		String valorDepositadoStr = JOptionPane.showInputDialog("Valor a ser depositado");
		Double valorDepositado = Double.parseDouble(valorDepositadoStr);
		c.depositar(valorDepositado);
	}

	private Conta criarContaPoupanca() {
		Conta c = new ContaPoupanca();
		String numeroContaStr = JOptionPane.showInputDialog("Informe o número da conta"); 
		c.numeroConta = Long.parseLong(numeroContaStr);
		c.proprietario = new Cliente();
		c.proprietario.nome = JOptionPane.showInputDialog("Informe o nome do proprietario da conta");
		String cpfStr = JOptionPane.showInputDialog("Informe o cpf do proprietario da conta");
		c.proprietario.cpf = Long.parseLong(cpfStr);
		return c;
	}
	
	private Conta criarContaInvestimento() {
		Conta c = new ContaInvestimento();
		String numeroContaStr = JOptionPane.showInputDialog("Informe o número da conta"); 
		c.numeroConta = Long.parseLong(numeroContaStr);
		c.proprietario = new Cliente();
		c.proprietario.nome = JOptionPane.showInputDialog("Informe o nome do proprietario da conta");
		String cpfStr = JOptionPane.showInputDialog("Informe o cpf do proprietario da conta");
		c.proprietario.cpf = Long.parseLong(cpfStr);
		return c;
	}

	private Conta criarContaCorrente() {
		Conta c = new ContaCorrente();
		String numeroContaStr = JOptionPane.showInputDialog("Informe o número da conta"); 
		c.numeroConta = Long.parseLong(numeroContaStr);
		c.proprietario = new Cliente();
		c.proprietario.nome = JOptionPane.showInputDialog("Informe o nome do proprietario da conta");
		String cpfStr = JOptionPane.showInputDialog("Informe o cpf do proprietario da conta");
		c.proprietario.cpf = Long.parseLong(cpfStr);
		((ContaCorrente)c).pacote = new Pacote();
		String tarifaStr = JOptionPane.showInputDialog(" Informe o valor da tarifa");
		((ContaCorrente)c).pacote.tarifa = Double.parseDouble(tarifaStr);
		String limiteStr = JOptionPane.showInputDialog(" Informe o valor o limite de crédito");
		((ContaCorrente)c).limiteCredito = Double.parseDouble(limiteStr);
		return c;
	}
	
}
