package gilberto.colecao;

public class Pessoa {

	private String nome;
	private Integer peso;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
		this.peso = peso;
		this.peso = peso;
	}

	public Integer getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", peso=" + peso + "]";
	}

}
