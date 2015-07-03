package br.com.pandora.atividade;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		int condicao;
		do {
			System.out.print("Informe uma Condição ...");
			condicao = leitor.nextInt();

			switch (condicao) {
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
				JOptionPane.showMessageDialog(null, "Este dia na semana nao existe");
				break;
			}

		} while (condicao != 0);
		leitor.close();
		System.out.print("Bobô ...");
	}
}
