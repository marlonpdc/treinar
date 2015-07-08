package br.com.treinar.estudo.heranca;

import br.com.treinar.estudo.encapsulamento.Funcionario;

public class TesteHeranca {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setBonificacao(10);
		
		Funcionario p = new Funcionario();
		p.setNome("Igor Yuri");
		
		Funcionario gerente = new Gerente();		
	}
	
}
