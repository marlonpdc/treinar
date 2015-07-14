package br.com.treinar.wrapper;


public class TesteWrapper {

	public static void main(String[] args) {
		
		Integer i = Integer.valueOf(1000);
		Integer j = 1000;
		
		int k = 1000;
		int l = 1000;
		
		System.out.println(i == j);
		System.out.println(k == l);
		
		String umStr = "1" ;
		
		Integer umInteger = Integer.valueOf(umStr);
		//Integer umInteger = Integer.parseInt(umStr);
		
		System.out.println(umInteger + 1);
		
		Long numLong = 10l;
		System.out.println(numLong);
		
		Boolean boo = Boolean.FALSE;
		System.out.println(boo);
		
		Character c = 'a';
		
		
		
		
		
	}
	
}
