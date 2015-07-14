package br.com.treinar.estudo;

public class Pessoa implements Comparable<Pessoa> {

	public String nome;
	public Integer idade;
	public int pesoEmGramas;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	public Pessoa(String nome, int idade) {
		this(nome);
		this.idade = idade;
		System.out.println(this.calcularIdadeEmDias());
	}
	
	int calcularIdadeEmDias() {
		return idade * 365;
	}
	
	public boolean compararIgualdade(Pessoa other) {
		return other.idade == this.idade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idade != other.idade)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.idade + " " + pesoEmGramas;
	}

	@Override
	public int compareTo(Pessoa o) {
		return idade.compareTo(o.idade);
	}

}
