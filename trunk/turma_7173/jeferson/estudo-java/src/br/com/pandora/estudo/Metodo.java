package br.com.pandora.estudo;

public class Metodo {
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		System.out.println(carro.status);
		carro.ligar();
		System.out.println(carro.status);
		
	}

}
