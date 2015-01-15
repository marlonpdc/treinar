package br.com.treinar.tarefa.Caio;

public class Vetor {
	
	public static void main(String[] args) {
		String[] vetor = new String[5];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = "Numero: "+ (i+1);
		}
		
		Integer c = 0;
		for(c = 0; c < 5; c++){
			System.out.println(vetor[c]);
		}

		System.out.println("Fibonacci");
		
		int[] fib = new int[20];
		fib[0]=0;
		fib[1]=1;
		fib[2]=1;
		for (int i = 3; i < fib.length; i++) {
			fib[i]= fib[i-1] + fib[i-2];
			System.out.println();
		}
		for (int i = 0; i < fib.length; i++) {
			System.out.println(fib[i]);
		}
		
	}

}
