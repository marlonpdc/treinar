package br.com.bancodobrasil.teste;

public class TesteVetor {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[10];
		numeros[0] = 99;
		numeros[1] = 88;
		numeros[2] = 77;
		numeros[3] = 66;
		numeros[4] = 55;
		numeros[5] = 44;
		numeros[6] = 33;
		numeros[7] = 22;
		numeros[8] = 11;
		numeros[9] = 00;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		
	}
	
}
