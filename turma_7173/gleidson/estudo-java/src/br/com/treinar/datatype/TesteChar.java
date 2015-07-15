package br.com.treinar.datatype;

public class TesteChar {

	public static void main(String[] args) {
		char c;
		for (int i = 0; i < 128; i++) {
			c = (char) i;
			System.out.println(i + " " + c + " ");
		}
		
		System.out.println("Char...");
		
		for (char i = 'a'; i < 'z'; i++) {
			System.out.println(i);
		}
		char num225 = 225;
		System.out.println(num225);
		
		
	}
	
}
