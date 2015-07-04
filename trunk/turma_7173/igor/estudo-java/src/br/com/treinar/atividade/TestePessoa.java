package br.com.treinar.atividade;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();

		p.altura = 1.75;
		p.nome = "Fulano de Tal";
		p.idade = 18;

		p.falar();

		System.out.println("Altura: " + p.altura);
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);

		Pessoa nova = p;

		nova.altura = 1.85;

		System.out.println("Altura: " + p.altura);

		p = null;
		
		nova.idade = 25;
		nova.nome = "O Jeferson é muito chato";

		System.out.println("Altura: " + nova.altura);
		System.out.println("Altura: " + nova.idade);
		System.out.println("Altura: " + nova.nome);
		
		nova.falar();
		

	}

}
