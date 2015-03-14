package daniel;

import estudo.construtor.Pessoa;

public class AtividadeArray {

	
	public static void main(String[] args) {
		
		Pessoa[] pessoas = new Pessoa[2];
		
		pessoas[0] = new Pessoa();
		pessoas[0].nome = "Daniel";
		pessoas[0].peso = 100;
		pessoas[0].velocidadeAtual = 0;

		pessoas[1] = new Pessoa();
		pessoas[1].nome = "Jose";
		pessoas[1].peso = 120;
		pessoas[1].velocidadeAtual = 20;
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Nome: " + pessoas[i].nome);
			System.out.println("Peso: " + pessoas[i].peso);
			System.out.println("Velocidade: " + pessoas[i].velocidadeAtual);			
		}
		
	}
}
