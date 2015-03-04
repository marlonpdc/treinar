package br.com.treinar.estudo.modelo;

public class Atleta {
	
	public String nome;
	public Integer idade;
	public Integer velocidade;
	
	public void correr() {
		velocidade = 6;
	}
	
	public String recuperarStatus() {
		String status = "";
		switch (velocidade) {
		case 0:
			status = "Parado";
			break;
		case 3:
			status = "Andando";
			break;
		case 6:
			status = "Correndo";
			break;

		default:
			break;
		}
		return status;
	}
	
}
