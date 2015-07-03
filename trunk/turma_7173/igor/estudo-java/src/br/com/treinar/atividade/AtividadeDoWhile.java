package br.com.treinar.atividade;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AtividadeDoWhile {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int condicao;

		do {
			System.out.print("Condição: ");
			condicao = leitor.nextInt();

			switch (condicao) {
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
				JOptionPane.showMessageDialog(null,
						"Digita o numero certo camarada...");
				break;
			}

		} while (condicao != 0);
		
		JOptionPane.showMessageDialog(null, "Acabou!!!!!!!!!");
		
		leitor.close();

	}

}
