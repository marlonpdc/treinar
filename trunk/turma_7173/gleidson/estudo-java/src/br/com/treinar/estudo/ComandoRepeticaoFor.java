package br.com.treinar.estudo;

import java.util.Scanner;


public class ComandoRepeticaoFor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		for (int i = 10; i < 10; i++) {
			System.out.println("Gleidson... " + i);
		}
		System.out.println("Fim");
		
		Scanner sc = new Scanner(System.in);
		
		//labeled
		
		for (int i = 0; i < 10; i++) {
			labelUm:
			for (int j = 0; j < 10; j++) {
				labelDois:
				for (int j2 = 0; j2 < 20; j2++) {
					System.out.println("Numero: ");
					if (sc.nextInt() % 2 == 0) {
						break labelUm;
					} else {
						break labelDois;
					}
				}
				System.out.println("For Dois Parado");
			}
			System.out.println("For um Parado");
		}
		sc.close();
		
	}

	
}
