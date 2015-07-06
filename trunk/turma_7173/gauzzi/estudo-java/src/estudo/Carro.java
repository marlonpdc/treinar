package br.com.treinar.estudo;

import br.com.treinar.estudo.Motor;

public class Carro {

	public String cor;
	public int velocidade;
	public String modelo;
	boolean status;

	Motor motor;
	
	public void acelerar() {
		velocidade++;
	}
	
	public void acelerar(int qtdKm) {
		velocidade += qtdKm;
	}

	public void desacelerar() {
		velocidade--;
	}
	
	public int recuperarVelocidade() {
		//de alguma maneira calcula a velocidade
		return velocidade;
	}
	
	void ligar() {
		//rotina...
		status = true;
	}
	
}

