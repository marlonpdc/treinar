package br.com.meneguite.estudo;

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

	public Motor recuperarMotor() {
		Motor m = new Motor();
		m.fabricante = "GM";
		m.numMarchar = 5;
		m.potencia = 2;
		return m;
	}
	
	public void acelerar(int qtdKm, int tempo) {
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
