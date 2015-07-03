package br.com.treinar.atividade;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComandoCondicionalSwitcCase {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		 System.out.println("informe a opcao:");
		int opcao = leitor.nextInt();
		
		System.out.println("opcao selecionada: " + opcao);
		
		switch (opcao) {
		case 1:
			JOptionPane.showConfirmDialog(null, "Domingo");
			break;
		case 2:
			JOptionPane.showConfirmDialog(null, "Domingo");
			break;
		case 3:
			JOptionPane.showConfirmDialog(null, "Domingo");
			break;
		case 4:
			JOptionPane.showConfirmDialog(null, "Domingo");
			break;
		case 5:
			JOptionPane.showConfirmDialog(null, "Domingo");
			break;
		case 6:
			JOptionPane.showConfirmDialog(null, "Domingo");
			break;
		case 7:
			JOptionPane.showConfirmDialog(null, "Domingo");
			break;

		default:
			break;
		}
		leitor.close();
	}

}
