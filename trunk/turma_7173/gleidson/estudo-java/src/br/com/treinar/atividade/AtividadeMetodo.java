package br.com.treinar.atividade;

import br.com.treinar.estudo.Carro;
import br.com.treinar.estudo.Motor;

public class AtividadeMetodo {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		for (int i = 0; i < 60; i++) {
			carro.acelerar();
		}
		int velocidadeAtual = carro.recuperarVelocidade();
		System.out.println(velocidadeAtual);
		
		for (int i = velocidadeAtual; i > 30; i--) {
			carro.desacelerar();
		}
		System.out.println(carro.recuperarVelocidade());
		
		Motor motor = carro.recuperarMotor();
		System.out.println(motor.fabricante);
		
		carro.recuperarMotor();
		System.out.println();
		
	}
	
}
