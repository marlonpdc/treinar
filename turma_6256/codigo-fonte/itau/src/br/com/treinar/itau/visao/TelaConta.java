package br.com.treinar.itau.visao;

import javax.swing.JOptionPane;

import br.com.treinar.itau.modelo.ContaCorrente;
import br.com.treinar.itau.modelo.ContaPoupanca;
import br.com.treinar.itau.modelo.principal.Conta;
import br.com.treinar.itau.modelo.principal.Pessoa;

public class TelaConta {

	public Conta conta;
	
	public void iniciarBanco() {
		String menu = "Digite:\n"
					+ "1 - Criar Conta\n"
					+ "2 - Depositar\n"
					+ "3 - Sacar\n"
					+ "4 - Exibir Saldo\n"
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

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
				break;
			}
		} while (!opcaoStr.equals("0"));
		
		
	}

	private void exibirSaldo() {
		JOptionPane.showMessageDialog(null, "Saldo: " + conta.recuperarSaldo());
	}

	private void sacar() {
		Boolean sacou = conta.sacar(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
		JOptionPane.showMessageDialog(null, sacou ? "Saque efetuado com sucesso!" : "Saque nao efetuado!");
	}

	private void depositar() {
		conta.depositar(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
		JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso");
	}

	private void cadastrarConta() {
		String menu = "Digite:\n"
					+ "1 - Conta Corrente\n"
					+ "2 - Conta Poupança\n";
		String opcaoStr = JOptionPane.showInputDialog(menu);
		String numeroContaStr = JOptionPane.showInputDialog("Informe o numero da conta.");
		Integer numeroConta = Integer.parseInt(numeroContaStr);
		switch (opcaoStr) {
		case "1":
			conta = new ContaCorrente(numeroConta);
			cadastrarContaPadrao();
			concluirCadastroContaCorrente((ContaCorrente) conta);
			break;
		case "2":
			conta = new ContaPoupanca(numeroConta);
			cadastrarContaPadrao();
			concluirCadastroContaPoupanca((ContaPoupanca) conta);
			break;

		default:
			break;
		}
		JOptionPane.showMessageDialog(null, conta.getClass().getSimpleName() + " cadastrada com sucesso!");
	}
	
	private void cadastrarContaPadrao() {
		conta.pessoa = new Pessoa();
		conta.pessoa.nome = JOptionPane.showInputDialog("Nome do cliente");
		conta.pessoa.cpf = Long.parseLong(JOptionPane.showInputDialog("CPF do cliente"));
	}
	
	private void concluirCadastroContaCorrente(ContaCorrente cc) {
		String tarifaStr = JOptionPane.showInputDialog("Valor da tarifa");
		cc.tarifa = Double.parseDouble(tarifaStr);
		String limiteCreditoStr = JOptionPane.showInputDialog("Valor do limite de credito");
		cc.limiteCredito = Double.parseDouble(limiteCreditoStr);
	}
	
	private void concluirCadastroContaPoupanca(ContaPoupanca cp) {
		String taxaRendimentoStr = JOptionPane.showInputDialog("Valor da taxa de rendimento");
		cp.taxaRendimento = Float.parseFloat(taxaRendimentoStr);
	}
	
}
