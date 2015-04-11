package collection;

public class Pessoa implements Comparable<Pessoa> {
	
    private String nome;
	private Integer idade;
	private Double peso;
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Idade: " + idade + " Peso: " + peso;
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
	
	@Override
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(o.nome);
	}
	
	
	
	
}
