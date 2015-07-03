package br.com.treinar.atividade;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComandoRepeticaoDoWhite {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int condicao;
		do {
			System.out.println("condicao: ");
			condicao = leitor.nextInt();
			JOptionPane.showConfirmDialog(null, condicao);

		} while (condicao != 0);
		leitor.close();

	}
}
