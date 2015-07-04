package br.com.treinar.atividade;

public class Testeclasse {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.cor = "Amarelo";
		carro.modelo = "Crossfox";
		carro.velocidade = 100;
		carro.motor = new Motor();
		carro.motor.fabricante = "f";
	}

}
