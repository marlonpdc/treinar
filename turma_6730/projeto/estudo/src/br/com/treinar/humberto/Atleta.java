package br.com.treinar.humberto;

public class Atleta {
	
	public String nome;
	public int idade;
	public int velocidade;
	
	public void correr() {
		velocidade = 6;
		
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", idade=" + idade + ", velocidade="
				+ velocidade + "]";
	}
	

}
