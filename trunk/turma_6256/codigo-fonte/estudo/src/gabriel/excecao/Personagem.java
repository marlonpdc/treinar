package gabriel.excecao;


public class Personagem {

	private String nome;
	private Integer valor;
	
	public Personagem() {
		this.valor = 10;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return nome;
	}
	



}
