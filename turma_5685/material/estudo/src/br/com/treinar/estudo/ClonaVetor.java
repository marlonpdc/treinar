package br.com.treinar.estudo;

import java.util.Scanner;

public class ClonaVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("quantos numeros: ");
		Integer qtd = sc.nextInt();
		sc.nextLine();
		
		Integer[] vet1 = new Integer[qtd];
		
		lerVetor(sc, vet1);
		System.out.println("1 - mais numeros 2 - finalizar");
		Integer opcao = sc.nextInt();
		sc.nextLine();
		if (opcao.equals(1)) {
			Integer[] vetorAux = new Integer[qtd * 2];
			for (int i = 0; i < vet1.length; i++) {
				vetorAux[i] = vet1[i];
			}
			vet1 = vetorAux;
			
			
		}
		
		
		
		
	}

	private static void lerVetor(Scanner sc, Integer[] vet1) {
		for (int i = 0; i < vet1.length; i++) {
			System.out.print("numero " + (i + 1) + ": ");
			vet1[i] = sc.nextInt();
			sc.nextLine();
		}
	}
	
}
