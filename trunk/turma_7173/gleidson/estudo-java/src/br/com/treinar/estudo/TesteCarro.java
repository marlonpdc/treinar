package br.com.treinar.estudo;

public class TesteCarro {

	public static void main(String[] args) {
		Carro c = null;
		System.out.println("processando...");
		c = new Carro();
		
		String cor = "Amarelo";
		
		c.cor = cor;
		c.modelo = "Camaro";
		c.velocidade = 0;
		
		//c = new Carro();
		Carro novo = c;
		
		System.out.println(novo.modelo);
		c.modelo = "Fusca";
		
		System.out.println(novo.modelo);
		
		System.out.println(c.velocidade);
		c.acelerar();
		System.out.println(c.velocidade);
		
		novo = null;
		c = null;
	
	}
	
}
