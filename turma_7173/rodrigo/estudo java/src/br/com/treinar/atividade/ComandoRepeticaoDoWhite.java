package br.com.treinar.atividade;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComandoRepeticaoDoWhite {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int condicao;
		
		System.out.println("opcao:");
		condicao = leitor.nextInt();
		
		while (condicao !=0) {
			while (condicao > 0) {
				System.out.println("gleidson " + condicao);
			}
		}
		
		
		
		
		
		
		
		
		
		
		do {
			System.out.println("condicao: ");
			condicao = leitor.nextInt();
			JOptionPane.showConfirmDialog(null, condicao);

		} while (condicao != 0);
		leitor.close();

	}
}
