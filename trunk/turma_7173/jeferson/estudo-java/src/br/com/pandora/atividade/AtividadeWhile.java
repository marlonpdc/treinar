package br.com.pandora.atividade;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe uma Condição ...");
		int condicao = leitor.nextInt();
		int contador = 1;

		while (condicao != 0) {

			while (condicao != 0) {

				System.out.println("Numero :" + (contador)
						+ "  Digito sertiimmm ... seu goiaba");

				condicao--;
				contador++;
			}
			System.out.print("Informe uma Condição ...");
			condicao = leitor.nextInt();
		}
		leitor.close();
	}

}
