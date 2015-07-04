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
		
		nova.endereco = new Endereco();
		
		nova.endereco.bairro = "Castelo";
		nova.endereco.nomeRua = "Castelo de Guimarães";
		nova.endereco.num = 137;
		
		System.out.println("Nome da Rua: " + nova.endereco.bairro);
		System.out.println("Nome do Bairro: " + nova.endereco.nomeRua);
		System.out.println("Número: " + nova.endereco.num);

	}

}
