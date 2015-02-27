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
			opcaoStr = menu();
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 0:
				JOptionPane.showMessageDialog(null, "Fim do programa");
				break;
			case 1:
				criarConta();
				break;
				
			case 2:
				depositar();					
				
				break;
			case 3:
				sacar();					
				
				break;
				
			default:
				break;
			}
			
		} while (opcao != 0);
	}

	private String menu() {
		String opcaoStr = JOptionPane.showInputDialog("Informe uma opção:\n"
				+ "1 - Cadastrar Conta\n"
				+ "2 - Depositar\n"
				+ "3 - Sacar\n"
				+ "0 - Sair\n");
		return opcaoStr;
	}

	private void sacar() {
		Double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));			
		Boolean saqueEfetuado = conta.sacar(valorSaque);
		JOptionPane.showMessageDialog(null, saqueEfetuado ? "Saque efetuado!" : "Saque nao efetuado");		
	}

	private void depositar() {
		Double depositoN = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));			
		Boolean depositoEfetuado = conta.depositar(depositoN);
		JOptionPane.showMessageDialog(null, depositoEfetuado ? "Deposito efetuado!" : "Deposito nao efetuado");
	}

	private void criarConta() {
		String numeroContaStr;
		conta = new Conta();
		numeroContaStr = JOptionPane.showInputDialog("Digite o numero da conta");
		conta.numeroConta = Integer.parseInt(numeroContaStr);
		conta.saldo = 0d;
		//conta.pessoa = new Pessoa();
		conta.pessoa.nome = JOptionPane.showInputDialog("Digite o nome do proprietario");
		conta.pessoa.cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do proprietario"));
		
		JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
	}


	void teste() {
		conta = new Conta();
	}
	
}
