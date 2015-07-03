package br.com.treinar.atividade;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AtividadeDoWhile {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int numero;

		do {
			System.out.println("informe o numero:");
			numero = leitor.nextInt();
			switch (numero) {
			case 1:
				JOptionPane.showMessageDialog(null, "domingo");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "segunda");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "terca");
				
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "quarta");
				
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "quinta");
				
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "sexta");
				
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "sabado");
				
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Goodby");								
				break;

			default:
				JOptionPane.showMessageDialog(null, "inválido");				
				break;
			}
		} while (numero != 0);
		leitor.close();
	}

}
