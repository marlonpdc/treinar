package br.com.treinar.estudo.heranca;

import br.com.treinar.estudo.encapsulamento.Funcionario;

public class Diretor extends Funcionario{
	


	public Diretor(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public double calcularBonificacao() {
		return 20;
	}
	
	@Override
	public int calcularDiasFerias() {
		int numDias = super.calcularDiasFerias();
		return numDias + 2;
	}
	
}
