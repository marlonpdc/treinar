package br.com.treinar.estudo.encapsulamento;

import br.com.treinar.estudo.Carro;

public class TesteDefault {

	public static void main(String[] args) {
		Carro c = new Carro();
		//atributo default nao pode ser acessado fora
		//do pacote em que a classe foi criada
		//c.cor = "Erro";
	}
	
}
