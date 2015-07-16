package br.com.treinar.atividade;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadeException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer c = 0;

		try {

			do {
				System.out.print("Digite: ");
				c = sc.nextInt();
			} while (c > 0);

		} catch (InputMismatchException e) {
			System.out.println("Deu merda.");
		} catch (Exception e) {
			System.out.println("Entrou no exception...");
		} finally {
			sc.close();
			System.out.println("Acabou!!!!!");
		}
	}

}
