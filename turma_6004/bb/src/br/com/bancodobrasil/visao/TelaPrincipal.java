package br.com.bancodobrasil.visao;

import javax.swing.JOptionPane;

public class TelaPrincipal {
			
	public void init() {
		
		Integer opcao = -1;
		
		do {
			String msg = "Digite:\n1-Criar Conta\n"
					+ "2-Depositar\n"
					+ "3-Exibir Saldo\n"
					+ "0-Sair";
			String opcaoStr = JOptionPane.showInputDialog(msg);
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 1:
				System.out.println("opcao 1");
				break;
			case 2:
				System.out.println("opcao 2");
				//Adriana
				break;
			case 3:
				System.out.println("opcao 3");
				//Erica
				break;
			case 0:
				System.out.println("opcao sair 0");
				//Erica
				break;

			default:
				System.out.println("opcao errada");
				break;
			}
			
			
		} while (opcao != 0);
		
	}
	
}
