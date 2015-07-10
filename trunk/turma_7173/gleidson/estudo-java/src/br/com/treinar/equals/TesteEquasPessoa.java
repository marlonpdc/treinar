package br.com.treinar.equals;

import br.com.treinar.estudo.Pessoa;

public class TesteEquasPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Gleidosn";
		pessoa1.idade = 25;
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Gabriel";
		pessoa2.idade = 25;
		
		System.out.println("" + pessoa1.compararIgualdade(pessoa2));
		
		Pessoa pessoa3 = pessoa1;
		
		System.out.println(pessoa1.equals(pessoa2));
		System.out.println(pessoa1.hashCode());
		System.out.println(pessoa2.hashCode());
		System.out.println(pessoa1 == pessoa3);
		
		
	}
	
}
