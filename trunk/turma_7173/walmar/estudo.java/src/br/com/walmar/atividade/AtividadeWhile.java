package br.com.walmar.atividade;

import java.util.Scanner;

public class AtividadeWhile {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int condicao;
		System.out.print("Opção");
		condicao = leitor.nextInt();

		while (condicao != 0) {
			while (condicao > 0) {
				System.out.println("Walmar " + condicao--);
				
			}

			System.out.print("Opção");
			condicao = leitor.nextInt();

		}
		leitor.close();
		System.out.print("Finalizou");
		
	}
	
}
