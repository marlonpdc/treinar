package estudo;

public class TesteCarro {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.cor = "Amarelo";
		c.modelo = "Camaro";
		c.velocidade = 0;
		System.out.println(c.velocidade);
		c.acelerar();
		System.out.println(c.velocidade);
		c.freiar();
		System.out.println(c.velocidade);
		
		for (int i = c.velocidade; i < 60; i++) {
			c.acelerar();
			System.out.println("Acelerando com o for: (" + c.velocidade + ")");
		}
		
		int velocidadeAtual = c.recuperarVelocidade();
		for (int i = velocidadeAtual; i > 30; i--) {
			c.freiar();
			System.out.println("Reduzindo com o for: (" + c.velocidade + ")");
		}

		do {
			c.acelerar();
			System.out.println("Acelerando...(" + c.velocidade + ")");
		} while (c.recuperarVelocidade() < 60);
		System.out.println(c.velocidade);

		do {
			c.freiar();
			System.out.println("Reduzindo...(" + c.velocidade + ")");
		} while (c.recuperarVelocidade() > 30);
		System.out.println(c.velocidade);
		
        c.acelerar(10);
		System.out.println("metodo com sobrecarga:" + c.velocidade);
	}

}
