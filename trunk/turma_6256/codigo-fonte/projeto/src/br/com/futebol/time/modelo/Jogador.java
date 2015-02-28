package br.com.futebol.time.modelo;

public class Jogador {

	public String nome;
	public int idade;
	public String posicao;
	
	public void chutar() {
		
		if (posicao == "Atacante") {
			System.out.println("Chutou no gol");
		} else
			System.out.println("Chuto pra fora!");
		
	}
	
}
