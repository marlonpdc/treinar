package br.com.treinar.humberto;

public class Atleta implements Comparable<Atleta>{
	
	public String nome;
	public int idade;
	public int velocidade;
	
	public Atleta() {
		
	}
	
	public Atleta(String nome, int idade, int velocidade) {
		this();
		this.nome = nome;
		this.idade = idade;
		this.velocidade = velocidade;
	}

	public void correr() {
		velocidade = 6;
		
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", idade=" + idade + ", velocidade="
				+ velocidade + "]";
	}

	public int compareTo(Atleta o) {
		return nome.compareTo(o.nome);
	}


}
