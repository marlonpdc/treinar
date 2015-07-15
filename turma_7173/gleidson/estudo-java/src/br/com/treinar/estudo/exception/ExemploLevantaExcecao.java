package br.com.treinar.estudo.exception;

import java.util.Scanner;

public class ExemploLevantaExcecao {

	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		try {
			metodoUm(sc);
		} catch (Exception e) {
			System.out.println("exception");
			throw new Exception();
		} finally {
			sc.close();			
		}
		System.out.println("caso entre no catch nao sera executado");
		
	}

	private static void metodoUm(Scanner sc) throws Exception {
		Integer i = -1;
		Integer cont = 0;

		do {
			System.out.print("Digite um numero");
			i = sc.nextInt();
			if (i >= 10) {
				Exception exception = new Exception("Valor invalido");
				throw exception;
			}
			cont++;
		} while (cont <= 2);
	}
	
	
}
