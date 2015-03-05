package br.com.treinar.estudo.object;

public class ToString {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Sophia";
		p.idade = 2;
		
		System.out.println(p);
		
		ControleRemoto controle = new ControleRemoto();
		controle.cor = "Preto";
		controle.peso = 150;

		System.out.println(controle);
		
	}
	
	static class Pessoa {
		String nome;
		Integer idade;
	}
	
	static class ControleRemoto {
		String cor;
		Integer peso;
		
		@Override
		public String toString() {
			return "ControleRemoto [cor=" + cor + ", peso=" + peso + "]";
		}
		
		/*@Override
		public boolean equals(Object obj) {
			ControleRemoto outro = (ControleRemoto) obj;
			Boolean ehIgual = peso == outro.peso;
			return ehIgual;
		}*/
		

	}
	
}
