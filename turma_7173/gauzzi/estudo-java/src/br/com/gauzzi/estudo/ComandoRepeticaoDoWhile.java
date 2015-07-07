package br.com.gauzzi.estudo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComandoRepeticaoDoWhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int condicao;
		do {
			System.out.print("Condição: ");
			condicao = leitor.nextInt();
			JOptionPane.showMessageDialog(null, condicao);
		} while (condicao != 0);
		System.out.println("fim...");
		leitor.close();
		
	}

	
}
