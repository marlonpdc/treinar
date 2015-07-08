package br.com.treinar.estudo.heranca;


public class Gerente extends Funcionario {

	public Gerente() {
		super(null);
	}
	
	public Gerente(String nome) {
		super(nome);
	}

	private double bonificacao;

	public double getBonificacao() {
		return bonificacao;
	}
	
	public void assinarCheque() {
		System.out.println("assinado...");
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	@Override
	public double calcularBonificacao() {
		return 10;
	}
	
}
