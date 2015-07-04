package br.com.treinar.estudo;

public class TesteClasse {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.cor = "Amarelo";
		carro.modelo = "Crossfox";
		carro.velocidade =  100;
		carro.motor = new Motor();
		carro.motor.fabricante = "fiat";
		carro.motor.numMarchar = 5;
		carro.motor.potencia = 2;
		
		System.out.println(carro.motor.numMarchar);
		
	}
	
}
