package br.com.meneguite.estudo;

import java.util.Scanner;

public class ComandoRepeticaoWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int condicao;
		System.out.println("Opção: ");
		condicao = leitor.nextInt();
		
		while (condicao != 0) {
		
			System.out.println("Gabriel...");
			System.out.println("Opção²: ");
			condicao = leitor.nextInt();
		}
		leitor.close();
	}
}
