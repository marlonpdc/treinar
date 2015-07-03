package br.com.treinar.estudo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComandoCondicionalSwitch {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a opcao: ");
		int opcao = leitor.nextInt();

		System.out.println("Opção selecionada: " + opcao);

		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Segunda-Feira");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Terça-Feira");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quarta-Feira");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Quinta-Feira");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sexta-Feira");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Sábado");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Digita o numero certo camarada...");
			break;
		}

		leitor.close();
	}

}
