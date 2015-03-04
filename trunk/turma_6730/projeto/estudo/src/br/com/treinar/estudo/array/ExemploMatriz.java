package br.com.treinar.estudo.array;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		Integer[][] matriz = new Integer[4][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (i + j);
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
