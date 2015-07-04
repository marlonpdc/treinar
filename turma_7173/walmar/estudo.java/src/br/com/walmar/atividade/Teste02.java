package br.com.walmar.atividade;

public class Teste02 {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.cor ="Amarelo";
		carro.modelo= "Cross Fox";
		carro.velocidade =100;
		carro.motor.fabricante="fiat";
		carro.motor.potencia=2;
		
		System.out.println(carro.motor.nuMachar);
		
	}

}
