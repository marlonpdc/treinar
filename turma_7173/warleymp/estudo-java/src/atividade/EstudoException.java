package atividade;

import java.util.Scanner;

public class EstudoException {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero = 1;

		try {
			while (numero != 0) {
				System.out.print("Informe um numero: ");
				numero = leitor.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Você não digitou um numero... ");
		} finally {
			leitor.close();
		}
	}

}
