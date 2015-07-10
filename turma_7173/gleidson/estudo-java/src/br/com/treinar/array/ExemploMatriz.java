package br.com.treinar.array;

public class ExemploMatriz {

	public static void main(String[] args) {
		Integer[][] matriz = new Integer[4][4];
		int cont = 1; 
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = cont++;
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
	
}
