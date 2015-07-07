package br.com.gauzzi.estudo;

public class Metodo {

	public static void main(String[] args) {
		Carro carro = new Carro();
		System.out.println(carro.status);
		carro.ligar();
		System.out.println(carro.status);
		
		int v = carro.recuperarVelocidade();
		System.out.println(v);
		
		do{
			carro.acelerar();
		}
		
		while(carro.velocidade < 60 );
		
		System.out.println(carro.velocidade);
		
		do{
			carro.desacelerar();
		}
		
		while(carro.velocidade > 30 );
	
		System.out.println(carro.velocidade);
	}
	
	
}
