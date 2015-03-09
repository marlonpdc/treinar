package br.com.treinar.estudo.modelo;

public class Atleta implements Comparable<Atleta> {
	
	public String nome;
	public Integer idade;
	public Integer velocidade;
	
	public Atleta() {
		super();
	}

	public Atleta(String nome, Integer idade, 
				  Integer velocidade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.velocidade = velocidade;
	}

	public void correr() {
		velocidade = 6;
	}
	
	public String recuperarStatus() {
		String status = "";
		switch (velocidade) {
		case 0:
			status = "Parado";
			break;
		case 3:
			status = "Andando";
			break;
		case 6:
			status = "Correndo";
			break;

		default:
			break;
		}
		return status;
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", idade=" + idade + ", velocidade="
				+ velocidade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Atleta other = (Atleta) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public int compareTo(Atleta o) {
		return nome.compareTo(o.nome);
	}
	
}
