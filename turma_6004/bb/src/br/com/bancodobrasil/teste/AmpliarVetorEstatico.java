package br.com.bancodobrasil.teste;

public class AmpliarVetorEstatico {

	public static void main(String[] args) {
		Integer[] vet = new Integer[3];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (i + 1); 
		}
		System.out.println("Tamanho antes do Plus: " + vet.length);
		Integer[] vetTemp = new Integer[6];
		for (int i = 0; i < vet.length; i++) {
			vetTemp[i] = vet[i];
		}
		vet = vetTemp;
		vetTemp = null;
		System.out.println("Tamanho depois do Plus: " + vet.length);
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
	}
	
}
