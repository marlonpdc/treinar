package br.com.walmar;

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
