package br.com.meneguite.estudo;

import java.util.Scanner;

public class ComandoRepeticaoFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Oi." + i);
		}
		System.out.println("CABÔ, JÃO");
		leitor.close();
		
		
	}
	
}
