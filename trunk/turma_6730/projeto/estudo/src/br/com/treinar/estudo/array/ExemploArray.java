package br.com.treinar.estudo.array;

import java.util.Scanner;

public class ExemploArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a quantidade de itens do array: ");
		Integer qtdNomes = sc.nextInt();
		sc.nextLine();
		String[] nomes = new String[qtdNomes];

		System.out.println("Tamanho do array: " + nomes.length);
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Informe o nome " + (i + 1) + ": ");
			nomes[i] = sc.nextLine();
		}
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i] + "\n");
		}
		
		sc.close();
		
 	
	}
	
}
