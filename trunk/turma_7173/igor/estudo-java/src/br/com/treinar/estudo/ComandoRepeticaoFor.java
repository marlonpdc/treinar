package br.com.treinar.estudo;

import java.util.Scanner;

public class ComandoRepeticaoFor {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite uma opção: ");
		int condicao = leitor.nextInt();
		
		for (int i = 0; i < condicao; i++) {
			
			System.out.println("ola...");
			
		}
		
		System.out.println("Acabou");
		leitor.close();
		
	}
	
}
