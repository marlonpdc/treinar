package br.com.treinar.bradesco;

import javax.swing.JOptionPane;

public class Banco {

	public Conta conta;
	
	public void iniciar() {
		String opcao = null;
		do {
			opcao = JOptionPane.showInputDialog("Digite\n1 - Criar Conta\n"
					+ "							 0 - Sair");

			switch (opcao) {
			case "1":
				conta = new Conta();
				Long numero = Long.parseLong(JOptionPane.showInputDialog("Numero da Conta"));
				conta.numeroConta = numero;
				
				String nomeTitular = JOptionPane.showInputDialog("Nome do Titular");
				Long cpf = Long.parseLong(JOptionPane.showInputDialog("CPF do Titular"));
				Double saldo = Double.parseDouble("Saldo da conta");
				conta.titular = new Titular();
				conta.titular.nome = nomeTitular;
				conta.titular.cpf = cpf;
				conta.saldo = saldo;
				break;

			default:
				break;
			}
			
			System.out.println("Opção: " + opcao);
		} while (opcao.equals("0"));
	}
	
	public void teste() {
		
	}
	
}
