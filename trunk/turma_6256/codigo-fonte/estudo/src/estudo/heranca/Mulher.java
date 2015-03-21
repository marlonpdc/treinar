package estudo.heranca;

import estudo.construtor.Pessoa;


public class Mulher extends Pessoa {

	private static final long serialVersionUID = -218653053242897591L;

	public Integer peso;
	
	public Mulher() {
		this.peso = super.peso;
	}
	
	
}
