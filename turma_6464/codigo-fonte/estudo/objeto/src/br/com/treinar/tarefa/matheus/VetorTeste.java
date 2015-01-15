package br.com.treinar.tarefa.matheus;

import java.util.Scanner;

public class VetorTeste {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[4];
		for(int i = 0; i < vetor.length; i++){
			System.out.print("Digite o numero do " + (i + 1) +"° indice: ");
			vetor[i] = sc.nextInt();
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
