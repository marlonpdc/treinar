package br.com.treinar.bradesco;

import javax.swing.JOptionPane;

public class Banco {

	public Conta conta;
	
	public void iniciar() {
		Integer opcao = null;
		do {
			String opcaoStr = JOptionPane.showInputDialog("Digite\n1 - Criar Conta\n"
					+ "							 0 - Sair");
			opcao = Integer.parseInt(opcaoStr);
			
			System.out.println("Opção: " + opcao);
		} while (opcao != 0);
	}
	
	public void teste() {
		
	}
	
}
