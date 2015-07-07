package br.com.pandora.atividade;

public class TesteConstrutorPessoa {
	
	public static void main(String[] args) {
		Pessoa jef = new Pessoa("Jef",25);
		
		System.out.println(jef.idade);
		System.out.println(jef.nome);
	}

}
