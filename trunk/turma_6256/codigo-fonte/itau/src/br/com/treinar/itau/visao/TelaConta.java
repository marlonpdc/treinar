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
		String numeroContaStr = null;
		String opcaoStr = null;
		do {
			opcaoStr = JOptionPane.showInputDialog(menu);
			switch (opcaoStr) {
			case "1":
				numeroContaStr = JOptionPane.showInputDialog("Informe o numero da conta.");
				conta = new Conta(Integer.parseInt(numeroContaStr));
				conta.pessoa = new Pessoa();
				conta.pessoa.nome = JOptionPane.showInputDialog("Nome do cliente");
				conta.pessoa.cpf = Long.parseLong(JOptionPane.showInputDialog("CPF do cliente"));
				break;
			case "2":
				conta.depositar(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
				break;
			case "3":
				Boolean sacou = conta.sacar(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
				JOptionPane.showMessageDialog(null, sacou ? "Saque efetuado com sucesso!" : "Saque nao efetuado!");				
				break;
			case "4":
				JOptionPane.showMessageDialog(null, "Saldo: " + conta.saldo);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
				break;
			}
		} while (!opcaoStr.equals("0"));
		
		
	}
	
}
