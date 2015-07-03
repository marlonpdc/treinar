package br.com.pandora.estudo;

public class TesteCarro {
	public static void main(String[] args) {
		 Carro c = new Carro();
		 c.cor ="Amarelo";
		 c.modelo ="Brasilia";
		 c.velocidade = 0;		 
		 System.out.println(c.velocidade);
		 c.acelerar();
		 System.out.println(c.velocidade);
	}

}
/*Operador de junção é o ponto
 * Metodo:Geralmente modifica a caracteristica de um objeto */
 