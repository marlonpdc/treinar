package br.com.pandora.estudo;

import java.util.Scanner;

public class ComandoWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe uma Condição ...");
		int condicao = leitor.nextInt();

		while (condicao != 0) {
			while (condicao != 0) {

				System.out.println("Digito sertiimmm ... seu goiaba");

				condicao--;
			}
			System.out.print("Informe uma Condição ...");
			condicao = leitor.nextInt();
		}

		leitor.close();
	}

}
