package br.com.treinar.estudo;

public class Array {
	
	public static void main(String[] args) {
		Integer[][] inteiros = new Integer[10][];
		for (int i = 0; i < 10; i++) {
			inteiros[i] = new Integer[i + 1];
		}
		for (int i = 0; i < inteiros.length; i++) {
			for (int j = 0; j < inteiros[i].length; j++) {
				System.out.print(inteiros[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
