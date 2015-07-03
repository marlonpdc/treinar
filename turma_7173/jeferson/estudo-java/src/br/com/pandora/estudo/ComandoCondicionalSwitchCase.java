package br.com.pandora.estudo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComandoCondicionalSwitchCase {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a Opçao ....");
		int opcao = leitor.nextInt();
		
		System.out.println("Opção Selecionada : " + opcao);
		
		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Segunda");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Terça");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quarta");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Quinta");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sexta");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Sabado");
			break;
		default:
			break;
		}
		
		leitor.close();
		
	}

}
