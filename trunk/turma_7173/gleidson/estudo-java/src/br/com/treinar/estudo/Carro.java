package br.com.treinar.estudo;

public class Carro {

	String cor;
	int velocidade;
	String modelo;

	Motor motor;
	
	void acelerar() {
		velocidade++;
	}

	void desacelerar() {
		velocidade--;
	}

}
