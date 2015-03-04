package br.com.treinar.estudo.array;

public class ParametroArray {

	public void testeParametroArray(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		for (String string : args) {
			System.out.println(string);
		}
		
		
	}
	public void testeParametroArray(Integer idade, String... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		for (String string : args) {
			System.out.println(string);
		}
		
		
	}
	
}
