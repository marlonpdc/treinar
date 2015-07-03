package br.com.treinar.estudo;

import java.util.Scanner;

public class ComandoRepeticaoWhile {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int condicao;
		System.out.print("\nDigite uma Opção: ");
		condicao = leitor.nextInt();
		int i = 0;

		while (condicao != 0) {
			while (condicao != 0) {
				i++;
				System.out.println("[" + i + "]  Ola Mundo!!!");
				condicao--;
			}			
			System.out.println("___________________");
			System.out.print("\nDigite uma Opção: ");			
			condicao = leitor.nextInt();
		}
		System.out.println("Acabou!!!");		
		leitor.close();
	}

}
