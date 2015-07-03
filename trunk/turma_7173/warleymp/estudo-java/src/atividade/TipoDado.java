package atividade;

public class TipoDado {

	static boolean bTrue;
	
	public static void main(String[] args){
		short s = 100;
		System.out.println(s);
	
		int i = 35055550;
		System.out.println(i);
		
		float f = (float) 10.5;
		float f2 = 10.5F;
		System.out.println(f);
		System.out.println(f2);
		
		double d = 50.5;
		System.out.println(d);
		
		boolean bFalse = false;
		System.out.println(bFalse);
		System.out.println("Valor default: " + bTrue);
		
		byte by = 100;
		System.out.println(by);
	}
}
