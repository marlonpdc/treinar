package br.com.treinar.array;

public class ExemploArrayInstanciado {

	public static void main(String[] args) {
		
		String[] nomes = {"Gleidson", "Maria Sophia", "Joana"};
		
		String[] nomesOld = new String[3];
		nomesOld[0] = "Gleidson";
		nomesOld[1] = "Maria Sophia";
		nomesOld[2] = "Joana";
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
	
}
