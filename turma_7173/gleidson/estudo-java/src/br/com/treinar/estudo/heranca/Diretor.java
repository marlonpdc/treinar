package br.com.treinar.estudo.heranca;

public class Diretor extends Funcionario {

	public Diretor(String nome) {
		super(nome);
	}
	
	public Diretor() {
		super(null);
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
