package br.com.meneguite.estudo.metodo;

public class Carro {

	public String cor;
	public int velocidade;
	public String modelo;
	boolean status;

	Motor motor;

	public void acelerar() {

		velocidade++;
	}

	public void desacelerar() {
		velocidade--;
	}

	int recuperarVelocidade() {
		// de alguma maneira calcula a velocidade
		return velocidade;
	}

	void ligar() {
		// rotina...
		status = true;
	}

}
