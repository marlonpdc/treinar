package atividade;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComandoCondicionalSwitchCase {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a opção: ");
		
		int opcao = leitor.nextInt();
		
		System.out.println("Opção selecionada: " + opcao);
		
		switch (opcao) {
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
		default:
			break;
		}
		
		leitor.close();
	}
}
