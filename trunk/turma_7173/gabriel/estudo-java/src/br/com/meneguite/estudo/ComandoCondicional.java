package br.com.meneguite.estudo;

public class ComandoCondicional {

	public static void main(String[] args) {
		
		int a = 10;
		boolean b = true;
		
		if (a == 10 && b) {
			System.out.println("a == 10 && b: verdadeiro");
		} else {
			System.out.println("a == 10 && b: falso");
		}
		
		
		if (!b) {
			System.out.println("a == 10 && b: verdadeiro");
		}
		
		
	}
}
