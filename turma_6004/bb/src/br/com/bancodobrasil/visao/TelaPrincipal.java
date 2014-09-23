package br.com.bancodobrasil.visao;

import javax.swing.JOptionPane;

public class TelaPrincipal {

	public void init() {
		
		Integer opcao = -1;
		
		do {
			String msg = "Digite:\n1-Depositar\n"
					+ "2-Exibir Saldo"
					+ "0-Sair";
			String opcaoStr = JOptionPane.showInputDialog(msg);
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 1:
				//Alanderson
				break;
			case 2:
				//Adriana
				break;
			case 0:
				//Erica
				break;

			default:
				break;
			}
			
			
		} while (opcao != 0);
		
	}
	
}
