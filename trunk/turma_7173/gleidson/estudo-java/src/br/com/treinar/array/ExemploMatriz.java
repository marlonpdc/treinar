package br.com.treinar.array;

public class ExemploMatriz {

	public static void main(String[] args) {
		Integer[][] matriz = new Integer[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = i;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
}
