package br.com.meneguite.atividade;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int numeroDia;
				
		
		do {
			
			System.out.println("Número: ");
			numeroDia = leitor.nextInt();
			
			switch (numeroDia) {
			case 1:
				JOptionPane.showMessageDialog(null, "Domingo");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Segunda-feira");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Terça-feira");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Quarta-feira");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Quinta-feira");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Sexta-feira");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Sábado");
				break;

			default: JOptionPane.showMessageDialog(null, "Inexistente");
				break;
			}
			
		} while (numeroDia != 0);
		
		leitor.close();
	}
	
}
