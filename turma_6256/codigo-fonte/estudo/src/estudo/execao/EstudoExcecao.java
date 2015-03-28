package estudo.execao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstudoExcecao {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Inform um número inteiro: ");
			//enviar email
			Integer inteiro = sc.nextInt();
			System.out.println("Número digitado: " + inteiro);
		} catch (InputMismatchException e) {
			System.out.println("Número inválido");
		}
		sc.close();
	}
	
	
	
}
