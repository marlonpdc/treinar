package br.com.meneguite.estudo.metodo;

public class Metodo {

	public static void main(String[] args) {
		Carro carro = new Carro();
		System.out.println(carro.status);
		carro.ligar();
		System.out.println(carro.status);
		
		int v = carro.recuperarVelocidade();
		System.out.println(v);
		
		//Velocidade ++ e Velocidade --
		for (int i = 0; i < 60; i++) {
			carro.acelerar();
		}
		int velocidadeAtual = carro.recuperarVelocidade();
		System.out.println(velocidadeAtual);
		
		for (int i = velocidadeAtual; i > 30; i--) {
			carro.desacelerar();
		}
		System.out.println(carro.recuperarVelocidade());
		
		
	}
	
}
