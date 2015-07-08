package br.com.pandora.estudo.heranca;

public class Gerente extends Pessoa {
	
	double bonificacao;
	
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public Gerente(String nome, String sobrenome) {
		super(nome, sobrenome);
	}

	

}
