package br.com.pandora.estudo;

//formtatar ctrl shift f
//identar ctrl i
public class Carro {
	String cor;
	String modelo;
	int velocidade;
	boolean status;

	void acelerar() {
		velocidade++;
	}
	
	void acelerar(int qtdKm) {
		velocidade += qtdKm;
	}

	void desacelerar() {
		velocidade--;
	}
	
	void ligar(){
		status = true;		
	}
	
	int recuperarVelocidade(){
		return velocidade;
	}
	
}
