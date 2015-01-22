package br.com.treinar.tarefa.Leandro;

public class IndiceInvalido {
	
	public static void main(String[] args) {
		Integer[] numeros = new Integer[2];
		
		try {
			System.out.println(numeros[2]);
			
		} catch (Exception e) {
			System.out.println("tratando a exececao!");
		}
		System.out.println("Fim do programa!");
	}

}
