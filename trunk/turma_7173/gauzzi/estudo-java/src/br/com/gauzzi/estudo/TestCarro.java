package br.com.gauzzi.estudo;

public class TestCarro {

	public static void main(String[] args) {

		Carro c = new Carro();
		c.cor = "amarelo";
		c.modelo = "camaro";
		System.out.println(c.velocidade);
		c.acelerar();
		System.out.println(c.velocidade);
		c.desacelerar();
		System.out.println(c.velocidade);
	}

}
