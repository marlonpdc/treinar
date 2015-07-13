package br.com.treinar.estudo.dominiodiscreto;

import java.util.Scanner;

public class AtividadeEnum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Opção: ");		
		Integer opcao = sc.nextInt();
		
		System.out.println(DiaSemana.values()[opcao]);
		
		sc.close();
		
	}
	
}
