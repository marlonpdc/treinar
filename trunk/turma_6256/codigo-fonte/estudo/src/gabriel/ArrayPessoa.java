package gabriel;

import estudo.construtor.Pessoa;

public class ArrayPessoa {

	public static void main(String[] args) {
		Pessoa[] pessoas= new Pessoa[2];
		pessoas[0] = new Pessoa();
		pessoas[0].nome = "Bruno";
		pessoas[1] = new Pessoa();
		pessoas[1].nome = "Daniel";
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(pessoas[i].nome);
		}
	}
}
