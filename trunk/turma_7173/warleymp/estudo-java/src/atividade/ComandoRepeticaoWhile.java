package atividade;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComandoRepeticaoWhile {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int condicao;
		System.out.print("opção: ");
		condicao = leitor.nextInt();

		while (condicao != 0){
			System.out.println("Gleidson... ");
			System.out.print("opção... ");
			condicao = leitor.nextInt();
		}


		leitor.close();
	}
}
