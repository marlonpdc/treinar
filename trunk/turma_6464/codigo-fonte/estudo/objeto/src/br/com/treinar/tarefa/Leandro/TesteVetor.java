package br.com.treinar.tarefa.Leandro;

public class TesteVetor {
	
	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		int i;
		
		for (i = 0; i < vetor.length; i++) {
			
			vetor[i] = i + 10;
			System.out.println(vetor[i]);
		}				
	}

}
