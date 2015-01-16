package br.com.treinar.aula.dois;

public class Equals {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf(10481L);
		pessoa.setNome("Vitória");
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setCpf(10481L);
		pessoa1.setNome("Vitória");
		
		Pessoa pessoa2 = pessoa;
		
		//equals
		System.out.println(pessoa.equals(pessoa1));

		
		
		
		
		
		
		
		
		System.out.println(pessoa.ehIgual(pessoa1));
		System.out.println(pessoa == pessoa1);
		System.out.println(pessoa == pessoa2);
		
		
		//toString
		System.out.println(pessoa);
		
		
	}
	
}
