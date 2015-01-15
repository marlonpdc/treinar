package br.com.treinar.aula.dois;

public class Matriz {

	public static void main(String[] args) {
		Integer[][] nomes = new Integer[10][];
		
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = new Integer[i + 1];
			for (int j = 0; j < nomes[i].length; j++) {
				nomes[i][j] = j + i;
			}
		}
		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < nomes[i].length; j++) {
				System.out.print(nomes[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
