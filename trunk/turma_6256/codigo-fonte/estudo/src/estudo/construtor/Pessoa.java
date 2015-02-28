package estudo.construtor;

public class Pessoa {

	public String nome;
	public Integer peso;
	public Integer velocidadeAtual;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public void correr() {
		velocidadeAtual = 2;
	}
	
	public void andar() {
		velocidadeAtual = 1;
	}
	
	public void parar() {
		velocidadeAtual = 0;
	}
	
}
