package br.com.treinar.estudo.heranca;


public class TesteHeranca {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setBonificacao(10);
		
		//classe abstrata nao pode ser instanciada
		//Funcionario p = new Funcionario();
		//p.setNome("Gleidosn");
		
		Funcionario gerente = new Gerente();
		System.out.println(gerente);
		//nao eh possivel atribuir uma 
		//instancia mais especifica em uma mais generica
		//Gerente g1 = new Pessoa();
		
		
		
		
		
	}
	
}
