package br.com.treinar.itau.visao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.treinar.itau.controle.ItauControle;
import br.com.treinar.itau.exception.ContaNaoCadastradaException;
import br.com.treinar.itau.exception.SaldoInsuficienteException;
import br.com.treinar.itau.modelo.ContaCorrente;
import br.com.treinar.itau.modelo.ContaPoupanca;
import br.com.treinar.itau.modelo.ContaSalario;
import br.com.treinar.itau.modelo.principal.Conta;
import br.com.treinar.itau.modelo.principal.Pessoa;

public class TelaConta {

	private ItauControle controle;

	public TelaConta() {
		controle = new ItauControle();
	}

	public void menuBanco() {
		String menu = "Digite:\n"
				+ "1 - Criar Conta\n"
				+ "2 - Depositar\n"
				+ "3 - Sacar\n"
				+ "4 - Exibir Saldo\n"
				+ "5 - Cadastrar taxa de rendimento\n"
				+ "6 - Excluir Conta\n"
				+ "7 - Listar Contas\n"
				+ "0 - Sair";
		String opcaoStr = null;
		do {
			opcaoStr = JOptionPane.showInputDialog(menu);
			switch (opcaoStr) {
			case "1":
				cadastrarConta();
				break;
			case "2":
				//conta.saldo = conta.saldo + 1000d;
				depositar();
				break;
			case "3":
				sacar();
				break;
			case "4":
				exibirSaldo();
				break;
			case "5":
				cadastrarTaxaRendimento();
				break;
			case "6":
				excluirConta();
				break;
			case "7":
				listarContas();
				break;
			case "0":
				controle.persistir();
				JOptionPane.showMessageDialog(null, "Fim do programa");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
				break;
			}
		} while (!opcaoStr.equals("0"));
	}

	private void listarContas() {
		Conta[] contas = controle.recuperarContas();
		String contasStr = "";
		for (Conta conta : contas) {
			if (conta != null) {
				contasStr += conta.numeroConta + " " + conta.pessoa.nome + " " + conta.recuperarSaldo() + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, contasStr);

	}

	private void excluirConta() {
		try {
			Conta conta = recuperarConta();
			controle.removerConta(conta);
		} catch (ContaNaoCadastradaException e) {
			JOptionPane.showMessageDialog(null, "Conta nao cadastrada");			
		}
	}

	private void cadastrarTaxaRendimento() {
		String taxaRendimentoStr = JOptionPane.showInputDialog("Valor antigo taxa de rendimento: " + ContaPoupanca.getTaxaRendimento());
		ContaPoupanca.setTaxaRendimento(Float.parseFloat(taxaRendimentoStr));
		JOptionPane.showMessageDialog(null, "Nova taxa de Rendimento\n" + ContaPoupanca.getTaxaRendimento());
	}

	private void exibirSaldo() {
		Conta conta;
		try {
			conta = recuperarConta();
			JOptionPane.showMessageDialog(null, "Saldo: " + conta.recuperarSaldo());			
		} catch (ContaNaoCadastradaException e) {
			JOptionPane.showMessageDialog(null, "Conta nao cadastrada");
		}
	}

	private void sacar() {
		try {
			Conta conta = recuperarConta();
			conta.sacar(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
			JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso!");			
		} catch (RuntimeException | SaldoInsuficienteException e) {
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
		} catch (ContaNaoCadastradaException e) {
			JOptionPane.showMessageDialog(null, "Conta Não Cadastrada!");
		}
	}

	private void depositar() {
		try {
			Conta conta = recuperarConta();
			conta.depositar(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
			JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso");			
		} catch (ContaNaoCadastradaException e) {
			JOptionPane.showMessageDialog(null, "Conta nao cadastrada");			
		}
	}

	private Conta recuperarConta() throws ContaNaoCadastradaException {
		return controle.recuperarConta(Integer.parseInt(JOptionPane.showInputDialog("Numero da conta")));
	}

	private void cadastrarConta() {
		Conta conta = null;
		String menu = "Digite:\n"
				+ "1 - Conta Corrente\n"
				+ "2 - Conta Poupança\n"
				+ "3 - Conta Salario\n";
		String opcaoStr = JOptionPane.showInputDialog(menu);
		String numeroContaStr = JOptionPane.showInputDialog("Informe o numero da conta.");
		Integer numeroConta = Integer.parseInt(numeroContaStr);
		switch (opcaoStr) {
		case "1":
			conta = new ContaCorrente(numeroConta);
			cadastrarContaPadrao(conta);
			concluirCadastroContaCorrente((ContaCorrente) conta);
			break;
		case "2":
			conta = new ContaPoupanca(numeroConta);
			cadastrarContaPadrao(conta);
			concluirCadastroContaPoupanca((ContaPoupanca) conta);
			break;
		case "3":
			conta = new ContaSalario(numeroConta);
			cadastrarContaPadrao(conta);
			concluirCadastroContaSalario((ContaSalario) conta);
			break;

		default:
			break;
		}
		controle.salvarConta(conta);
		JOptionPane.showMessageDialog(null, conta.getClass().getSimpleName() + " cadastrada com sucesso!");
	}

	private void cadastrarContaPadrao(Conta conta) {
		conta.pessoa = new Pessoa();
		conta.pessoa.nome = JOptionPane.showInputDialog("Nome do cliente");
		conta.pessoa.cpf = Long.parseLong(JOptionPane.showInputDialog("CPF do cliente"));
	}

	private void concluirCadastroContaSalario(ContaSalario cs) {
		cs.dataCreditoSalario = new Date();
	}

	private void concluirCadastroContaCorrente(ContaCorrente cc) {
		String tarifaStr = JOptionPane.showInputDialog("Valor da tarifa");
		cc.tarifa = Double.parseDouble(tarifaStr);
		String limiteCreditoStr = JOptionPane.showInputDialog("Valor do limite de credito");
		cc.limiteCredito = Double.parseDouble(limiteCreditoStr);
	}

	private void concluirCadastroContaPoupanca(ContaPoupanca cp) {

		String tarifaStr = JOptionPane.showInputDialog("Dia base para depósito");
		cp.diaBaseDeposito = Integer.parseInt(tarifaStr);

	}

}
