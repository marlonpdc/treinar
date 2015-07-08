package br.com.treinar.estudo.heranca;

import br.com.treinar.estudo.encapsulamento.Funcionario;

public class Gerente extends Funcionario{
	
	private double bonificacao;

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}	
}
