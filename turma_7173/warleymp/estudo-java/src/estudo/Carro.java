package estudo;

public class Carro {

	String cor;
	int velocidade;
	String modelo;
	boolean status;
	
	Motor motor;
	
	public void acelerar() {
		velocidade++;
	}
	
	public void acelerar(int qtdKm) {
		velocidade+=qtdKm;
	}

	void freiar() {
		velocidade--;
	}
	
	int recuperarVelocidade() {
		return velocidade;
	}
}
