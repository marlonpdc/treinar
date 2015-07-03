package estudo.java;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComandoCondicionalSwitchCase {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a opção");
		int opcao = leitor.nextInt();
		
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
			JOptionPane.showMessageDialog(null, "Sabado");
			break;

		default:
			break;
		}
		
		System.out.println("Opção selecionada: "+ opcao);
		
		leitor.close();
	}
}
