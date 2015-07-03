package atividade;

public class ComandoCondicional {

	public static void main(String[] args) {
		int a = 10;
		boolean b = true;
		
		if (a == 10 && b) {
			System.out.println("a == 10 && b: verdadeiro");
		} else {
			System.out.println("a == 10 && b falso");
		}

		String cumprimento = "";
		int h = 12;
		
		System.out.println("cumprimento" + cumprimento);
		System.out.println("cumprimento" + h);
		if (!b) {
			System.out.println("b: falso");
		}
		    System.out.println("a == 10 && b falso");

	}
}
