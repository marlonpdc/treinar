package br.com.treinar.atividade;

import java.util.Scanner;

public class AtividadeWhile {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int condicao;
		System.out.print("opçao: ");
		condicao = leitor.nextInt();

		while (condicao != 0) {
			while (condicao > 0) {
				System.out.println("Rodrigo " + condicao);
				condicao--;
			}
			System.out.print("opçao: ");
			condicao = leitor.nextInt();
		}
		leitor.close();
	}

}
