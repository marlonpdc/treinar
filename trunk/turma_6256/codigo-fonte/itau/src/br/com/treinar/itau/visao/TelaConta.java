package br.com.treinar.itau.visao;

import javax.swing.JOptionPane;

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
		JOptionPane.showMessageDialog(null, "Saldo: " + conta.saldo);
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
		String numeroContaStr;
		numeroContaStr = JOptionPane.showInputDialog("Informe o numero da conta.");
		//conta = new Conta(Integer.parseInt(numeroContaStr));
		conta.pessoa = new Pessoa();
		conta.pessoa.nome = JOptionPane.showInputDialog("Nome do cliente");
		conta.pessoa.cpf = Long.parseLong(JOptionPane.showInputDialog("CPF do cliente"));
	}
	
}
