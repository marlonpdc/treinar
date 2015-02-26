package br.com.treinar.humberto;

import br.com.treinar.priscila.Nome;

public class Exercicio2 {
	public static void main(String[] args) {
		Nome nomeUm = new Nome();
		nomeUm.nome = "Humberto";
		
		String nomeDois = nomeUm.nome;

		System.out.println(nomeUm.nome == nomeDois);				
		
	}

}
