package br.com.treinar.jair;

import br.com.treinar.priscila.Nome;



public class ExercicioDois {
	
	public static void main(String[] args) {

		Nome nome1 = new Nome();
		nome1.nome = "Jair";

		Nome nome2 = new Nome();
		nome2.nome = "Jair";

		System.out.println(nome1 == nome2);
		nome1.nome = nome2.nome;
		
		System.out.println(nome1 == nome2);

	}

}
