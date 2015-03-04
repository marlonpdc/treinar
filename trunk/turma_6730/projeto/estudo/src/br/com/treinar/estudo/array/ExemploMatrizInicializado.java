package br.com.treinar.estudo.array;

public class ExemploMatrizInicializado {

	public static void main(String[] args) {
		String[][] nomes = {{"Gleidson", "Ana"}, {"Sophia","Nathalia","Amanda"}};
		
		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < nomes[i].length; j++) {
				System.out.print(nomes[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
