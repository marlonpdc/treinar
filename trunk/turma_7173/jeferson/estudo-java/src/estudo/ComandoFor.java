package estudo;

import java.util.Scanner;

public class ComandoFor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite um numero...");
		int vezes = leitor.nextInt();

		for (int i = 0; i < vezes; i++) {
			System.out.println(" Foda-se");

		}
		leitor.close();
	}
}
