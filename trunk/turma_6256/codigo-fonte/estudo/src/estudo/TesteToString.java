package estudo;

import estudo.construtor.Pessoa;

public class TesteToString {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Sophia";
		p.peso = 15;
		p.velocidadeAtual = 30;
		
		
		System.out.println(p);
		
	}
	
}
