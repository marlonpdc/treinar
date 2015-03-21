package gabriel.colecao;

public class Pessoa {
	
    private String nome;
	private Integer idade;
	private Double peso;
	@Override
	public String toString() {
		return "Pessoa nome=" + nome + ", idade=" + idade + ", peso=" + peso + "";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
	
	
}
