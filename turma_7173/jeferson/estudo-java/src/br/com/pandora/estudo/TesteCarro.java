package br.com.pandora.estudo;

public class TesteCarro {
	public static void main(String[] args) {
		Carro c = new Carro();
		c.cor = "Amarelo";
		c.modelo = "Brasilia";
		c.velocidade = 0;
		System.out.println(c.velocidade);
		c.acelerar();
		System.out.println(c.velocidade);

		while (c.velocidade < 60) {
			c.acelerar();// Implicitamente incrementa a variavel velocidade para o momento em que a mesma for solicitada
		}
		int vel = c.recuperarVelocidade();
		System.out.println(vel);

		while (c.velocidade > 30) {
			c.desacelerar();

		}
		vel = c.recuperarVelocidade();
		System.out.println("A velocidade agora é de :" + vel);
		
		c.acelerar(20);
		
		System.out.println("A nova velocidade com o metodo com parametro é "+ c.recuperarVelocidade());
	}

}
/*
 * Operador de junção é o ponto Metodo:Geralmente modifica a caracteristica de
 * um objeto
*/
