package br.com.treinar.estudo.heranca;

import br.com.treinar.estudo.encapsulamento.Funcionario;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, int idade) {
		super(nome, idade);
	}
	
	private double bonificacao;

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	public void assinarCheque(){
		System.out.println("Assinado...");
	}
}
