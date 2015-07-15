package br.com.treinar.datatype;

public class TesteChar {

	public static void main(String[] args) {
		char c;
		for (int i = 0; i < 128; i++) {
			c = (char) i;
			System.out.println(i + " " + c + " ");
		}
	}
	
}
