package gleidson;

public class Pessoa {

	private String nome;
	private Integer peso;
	
	public String getNome() {
		return nome;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", peso=" + peso + "]";
	}
	
	
	
}
