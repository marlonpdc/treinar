package treinar;

public class TipoDado {

	static float f5;
	
	public static void main(String[] args) {
		
		// -128 ~ 127
		byte b = 10;
		System.out.println(b);
		
		//32.768 ~ 32.767 
		short s = 32000;
		System.out.println(s);
		
		//(-2^63) ~ (-2^63 - 1)
		int i = 548552458;
		System.out.println(i);
		
		long l = 1000215455;
		System.out.println(l);
		
		//casting
		float f = (float) 10.5;
		//casting
		float f1 = 10.5f;
		//casting
		float f2 = 10.5F;
		
		System.out.println("F5 = " + f5);
		
		System.out.println(f + " - " + f1 + " - " + f2);
	
		double d = 61321385435.8;
		double d1 = 6d;
		double d2 = 6D;
		double d3 = 6.;
		System.out.println(d + " - " + d1 + " - " + d2 + " - " + d3);
		
		boolean bool = true;
		System.out.println(bool);
		
		char c = 'a';
		System.out.println(c);
		char c1 = 65;
		System.out.println(c1);
		
		String str = "Palavra em java";
		System.out.println(str);
		
		

	}
	
}
