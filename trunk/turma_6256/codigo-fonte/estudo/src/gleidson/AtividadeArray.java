package gleidson;

import estudo.construtor.Pessoa;

public class AtividadeArray {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[2];
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		p1.nome = "Maria Sophia";
		p2.nome = "Amanda Cravo Moura";
		
		pessoas[0] = p1;
		pessoas[1] = p2;
		
		p1 = null;
		p2 = null;
	
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(pessoas[i]);
		}
		pessoas[0] = null;
		
		pessoas = null;
		
	}
	
}
