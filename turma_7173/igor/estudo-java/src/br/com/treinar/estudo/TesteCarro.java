package br.com.treinar.estudo;

public class TesteCarro {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.cor = "Amarelo";
		c.modelo = "Camaro";
		c.velocidade = 0;
		
		/*System.out.println(c.velocidade);
		c.acelerar();
		System.out.println(c.velocidade);
		c.desacelerar();
		System.out.println(c.velocidade);*/
		
		System.out.println(c.status);
		c.ligar();
		System.out.println(c.status);
		
	}
	
}
