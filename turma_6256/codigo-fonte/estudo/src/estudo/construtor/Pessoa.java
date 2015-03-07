package estudo.construtor;

public class Pessoa {

	public String nome;
	public Integer peso;
	public Integer velocidadeAtual;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	public Pessoa() {
		super();
	}

	public void correr() {
		velocidadeAtual = 2;
	}
	
	public void correr(Integer distancia, Integer velocidade) {
		velocidadeAtual = 2;
	}
	
	public void correr(Integer distancia) {
		velocidadeAtual = 2;
	}
	/*
	 * Não é possível dois metodos com as 
	 * mesmas sequencias de parametro
	 * 
	public void correr(Integer distancia) {
		velocidadeAtual = 2;
	}*/
	
	public void andar() {
		velocidadeAtual = 1;
	}
	
	public void parar() {
		velocidadeAtual = 0;
	}
	
}
