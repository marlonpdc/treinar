package br.com.treinar.itau;

import javax.swing.JOptionPane;

import br.com.treinar.itau.modelo.Conta;
import br.com.treinar.itau.modelo.Pessoa;

public class Itau {

	public Conta conta;
	
	public void iniciar() {
		Integer opcao = 0;
		String opcaoStr = null;
		do {
			opcaoStr = JOptionPane.showInputDialog("Informe uma opção:\n"
					+ "1 - Cadastrar Conta\n"
					+ "0 - Sair"
					+ "2 - Depositar");
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 0:
				JOptionPane.showMessageDialog(null, "Fim do programa");
				break;
			case 1:
				conta = new Conta();
				String numeroContaStr = JOptionPane.showInputDialog("Digite o numero da conta");
				conta.numeroConta = Integer.parseInt(numeroContaStr);
				conta.saldo = 0d;
				conta.pessoa = new Pessoa();
				conta.pessoa.nome = JOptionPane.showInputDialog("Digite o nome do proprietario");
				conta.pessoa.cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do proprietario"));
				
				JOptionPane.showInputDialog("Conta cadastrada com sucesso!");
				
				break;
				
			case 2:
				
				
				Double depositoN = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));			
				conta.depositar(depositoN);
				
				JOptionPane.showInputDialog("Deposito efetuado com sucesso!");
				
				break;
				
			default:
				break;
			}
			
		} while (opcao != 0);
	}


	void teste() {
		conta = new Conta();
	}
	
}
