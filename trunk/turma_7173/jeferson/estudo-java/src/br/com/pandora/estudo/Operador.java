package br.com.pandora.estudo;

public class Operador {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z = x + y;

		int a = 10;
		int b = 20;
		int c = a - b;

		int m = 10;
		int n = 20;
		int o = m * n;

		int e = 10;
		int f = 20;
		int g = e / f;

		double i = 2.5;
		int j = 2;
		double k = (i % j);
		System.out.println("    ");
		System.out.println("________________________");

		System.out.println("[x] + [y] é igual a " + z);
		System.out.println("[a] - [b] é igual a " + c);
		System.out.println("[m] * [n] é igual a " + o);
		System.out.println("[e] / [f] é igual a " + g);
		System.out.println("[i] % [j] é igual a " + k);
		System.out.println(" ");
		System.out.println("________________________");
		int incremento = ++a;
		System.out.println("Incremento " + incremento);
		System.out.println("    ");
		System.out.println("________________________");
		a = 10;
		b = 20;

		boolean igual = (a == b);
		System.out.println(igual);
		System.out.println(" ");
		System.out.println("________________________");
		boolean t = false;
		boolean w = false;
		boolean operadorOu = t || w;
		boolean operadorE = t && w;

		System.out.println("Ou " + operadorOu);
		System.out.println("E  " + operadorE);
		System.out.println(" ");
		System.out.println("________________________");
		operadorOu = t | w & a > 10;
		operadorE = t & w & b < 20;

		System.out.println("t | w & a > 10 " + operadorOu);
		System.out.println("t & w & b < 20 " + operadorE);

	}

}
