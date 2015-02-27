package br.com.treinar.itau;

import javax.swing.JOptionPane;

import br.com.treinar.itau.modelo.Conta;
import br.com.treinar.itau.modelo.Pessoa;

public class Itau {

	public Conta conta;
	
	public void iniciar() {
		Integer opcao = 0;
		String opcaoStr = null;
		String numeroContaStr = null;
		Double depositoN = null;
		Boolean depositoEfetuado = null;
		do {
			opcaoStr = JOptionPane.showInputDialog("Informe uma opção:\n"
					+ "1 - Cadastrar Conta\n"
					+ "0 - Sair\n"
					+ "2 - Depositar\n");
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 0:
				JOptionPane.showMessageDialog(null, "Fim do programa");
				break;
			case 1:
				conta = new Conta();
				numeroContaStr = JOptionPane.showInputDialog("Digite o numero da conta");
				conta.numeroConta = Integer.parseInt(numeroContaStr);
				conta.saldo = 0d;
				conta.pessoa = new Pessoa();
				conta.pessoa.nome = JOptionPane.showInputDialog("Digite o nome do proprietario");
				conta.pessoa.cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do proprietario"));
				
				JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
				
				break;
				
			case 2:
				depositoN = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));			
				depositoEfetuado = conta.depositar(depositoN);
				JOptionPane.showMessageDialog(null, depositoEfetuado ? "Deposito efetuado!" : "Deposito nao efetuado");					
				
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
