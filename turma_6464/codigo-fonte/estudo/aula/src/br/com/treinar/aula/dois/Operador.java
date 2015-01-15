package br.com.treinar.aula.dois;

public class Operador {

	public static void main(String[] args) {
		int i = 8;
		int j = 20;
		
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(j % i);
		
		int soma = 0;
		
		int sub = 55;
		
		int x = ++soma;
		
		System.out.println(x);
		System.out.println(soma);
		System.out.println(sub--);
		System.out.println(sub);
		
		
		boolean ehIgual = (i == j);
		boolean ehDiferente = (i != j);
		boolean maior = i > j;
		boolean menor = i < j;
		boolean maiorIgual = i >= j;
		boolean menorIgual = i <= j;
		
		int a = 5;
		int b = 9;
		
		boolean opE = i > j & a < b;
		boolean opOu = i > j | a < b;
		
		System.out.println(ehIgual);
		System.out.println(!ehIgual);
		System.out.println(ehDiferente);
		System.out.println(maior);
		System.out.println(maiorIgual);
		System.out.println(menor);
		System.out.println(menorIgual);
		System.out.println(opE);
		System.out.println(opOu);
		
	}
	
}
