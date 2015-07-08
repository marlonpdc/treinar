package br.com.treinar.estudo.heranca;

public class TesteAtribuicao {

	public static void main(String[] args) {
		Funcionario f = new Gerente();
		
		f.setNome("Fulano");
		((Gerente)f).assinarCheque();
	}
	
}
