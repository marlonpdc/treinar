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

	void acelerar(int qtdkm) {
		velocidade += qtdkm;
	}
	
	void desacelerar() {
		velocidade--;
	}
	
	void ligar(){
		//rotina...
		status = true;
	}
	
	int recuperarVelocidade(){
		return velocidade;
	}
	
	Motor recuperarMotor(){		
		Motor m = new Motor();
		m.fabricante = "GM"; 
		m.numMarcha = 5;
		m.potencia = 2;
		return m;
	}

}
