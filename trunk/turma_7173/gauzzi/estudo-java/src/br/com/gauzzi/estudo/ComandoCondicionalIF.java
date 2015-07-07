package br.com.gauzzi.estudo;

public class ComandoCondicionalIF {

	public static void main(String[] args) {
		int a = 10;
		boolean b = false;
		
		if (a == 10 && b) {
			System.out.println("a == 10 && b: verdadeiro");
		} else {
			System.out.println("a == 10 && b: falso");			
		}
		
		
		if (!b) {
			System.out.println("b: false");			
		}
			System.out.println("a == 10 && b: falso");			
		
		
	}
	
}
