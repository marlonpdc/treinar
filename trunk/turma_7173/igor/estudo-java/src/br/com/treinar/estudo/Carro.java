package br.com.treinar.estudo;

public class Carro {

	String cor;
	int velocidade;
	String modelo;
	boolean status;

	void acelerar() {
		velocidade++;
	}

	void desacelerar() {
		velocidade--;
	}
	
	void ligar(){
		//rotina...
		status = true;
	}
	
	

}
