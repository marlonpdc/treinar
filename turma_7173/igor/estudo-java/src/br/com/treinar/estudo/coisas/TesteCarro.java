package br.com.treinar.estudo.coisas;

public class TesteCarro {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.cor = "Amarelo";
		c.modelo = "Camaro";
		c.velocidade = 0;

		/*
		 * System.out.println(c.velocidade); c.acelerar();
		 * System.out.println(c.velocidade); c.desacelerar();
		 * System.out.println(c.velocidade);
		 * 
		 * System.out.println(c.status); c.ligar();
		 * System.out.println(c.status);
		 */

		System.out.println(c.recuperarVelocidade() + " Km/h");

		for (int i = 0; i < 60; i++) {
			c.acelerar();
		}

		System.out.println(c.recuperarVelocidade()+ " Km/h");

		for (int i = c.recuperarVelocidade(); i > 30; i--) {
			c.desacelerar();
		}
		
		System.out.println(c.recuperarVelocidade()+ " Km/h");
		
		c.acelerar(10);
		System.out.println(c.recuperarVelocidade()+ " Km/h");
		

	}

}
