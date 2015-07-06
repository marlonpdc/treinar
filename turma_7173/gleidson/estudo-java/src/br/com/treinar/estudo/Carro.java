package br.com.treinar.estudo;

public class Carro {

	String cor;
	int velocidade;
	String modelo;
	boolean status;

	Motor motor;
	
	void acelerar() {
		velocidade++;
	}

	void desacelerar() {
		velocidade--;
	}
	
	int recuperarVelocidade() {
		//de alguma maneira calcula a velocidade
		return velocidade;
	}
	
	void ligar() {
		//rotina...
		status = true;
	}
	
}
