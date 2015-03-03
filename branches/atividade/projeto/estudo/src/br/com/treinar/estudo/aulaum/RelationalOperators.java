package br.com.treinar.estudo.aulaum;

public class RelationalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a = " + a + " b = " + b);
		
		boolean igual = a == b;
		System.out.println("a == b: " + igual);

		boolean diferente = a != b;
		System.out.println("a != b: " + diferente);

		boolean negacao = !igual;
		System.out.println("igual negado: " + negacao);
		
		boolean maior = a > b;
		System.out.println("a > b: " + maior);

		boolean maiorIgual = a > b;
		System.out.println("a >= b: " + maiorIgual);
		
		boolean menor = a > b;
		System.out.println("a < b: " + menor);
		
		boolean menorIgual = a > b;
		System.out.println("a <= b: " + menorIgual);
		
		boolean operadorE = a > b && a == 10;
		System.out.println("a <= b: " + operadorE);
		
		boolean operadorOU = a > b || a == 10;
		System.out.println("a <= b: " + operadorOU);
		
		
	}
	
}
