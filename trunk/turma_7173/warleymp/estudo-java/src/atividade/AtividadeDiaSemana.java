package atividade;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AtividadeDiaSemana {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int condicao;
		do {
			System.out.print("Informe o Numero do dia: ");
			condicao = leitor.nextInt();

			switch (condicao) {
			case 1:
				JOptionPane.showMessageDialog(null, "domingo ");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "segunda feira");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "terça feira ");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "quarta feira ");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "quinta feira ");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "sexta feira ");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "sabado ");
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "finalizando ");
				break;
			default:
				JOptionPane.showMessageDialog(null, "não é um dia da semana ");
				break;
			}


		} while (condicao != 0);	
		leitor.close();
	}
}