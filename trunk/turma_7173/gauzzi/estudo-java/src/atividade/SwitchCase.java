package atividade;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("entre um valor aleatorio: ");
		int opcao = leitor.nextInt();
		System.out.println("seu valor foi " + opcao);
		leitor.close();
		
		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "Segunda");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Terça");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Quarta");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quinta");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Sexta");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sabado");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
			
		default:
			break;
		}
	}
}
