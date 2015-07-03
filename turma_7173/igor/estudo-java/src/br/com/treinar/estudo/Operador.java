package br.com.treinar.estudo;

public class Operador {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int z = x + y;

		int a = 10;
		int b = 20;
		int c = a - b;

		int d = 10;
		int e = 20;
		int f = d * e;

		int g = 20;
		int h = 11;
		int i = g / h;

		double j = 2.5;
		int l = 2;
		double m = (j % l);

		System.out.println("X[10] + Y[20]: " + z);
		System.out.println("A[10] - B[20]: " + c);
		System.out.println("D[10] * E[20]: " + f);
		System.out.println("G[20] / H[11]: " + i);
		System.out.println("J[2.5] % L[2]: " + m);

		int posIncremento = a++;
		System.out.println("Pos Incremento : " + posIncremento);

		int preIncremento = ++a;
		System.out.println("Pre Incremento: " + preIncremento);

		a = 10;
		b = 10;

		boolean igual = (a == b);
		System.out.println(igual);

		boolean t = false;
		boolean w = false;
		boolean operadorOu = t || w;
		boolean operadorE = t && w;

		System.out.println("T || W: " + operadorOu);
		System.out.println("T && W: " + operadorE);

		operadorOu = t | w & a > 10;
		operadorE = t & w & b < 20;

		System.out.println("T | W & a > 10: " + operadorOu);
		System.out.println("T & W & b < 20: " + operadorE);
				
	}
}
