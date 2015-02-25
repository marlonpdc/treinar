package br.com.treinar.estudo;

public class TipoDado {

	/**
	 * Este eh o metodo inicial do sistema
	 * @param args
	 */
	public static void main(String[] args) {
		
		byte b= 50;
		byte n= 50;
		
//		byte b, n = 50; esta maneira de declarar prejudica a legibilidade
		
		/*
		 * 
		  um texto 
		  grande 
		  comentado no 
		 * codigo
		 * 
		 */
		
		System.out.println(b);
		System.out.println(n);
		
		short s = 32000;
		System.out.println(s);
		
		int i = 525854554;
		System.out.println(i);
		
		long l = 10562654666L;
		System.out.println(l);
		
		float f = 3.14F;
		System.out.println(f);
		
		double d = 3.14;
		System.out.println(d);
		
		boolean boo = true;
		System.out.println(boo);
		
		char c = 'a';
		System.out.println(c);
		
		char letraA = 65;
		System.out.println(letraA);
		
		String nome = "Gleidson";
		System.out.println(nome);
		
	}
	
}
