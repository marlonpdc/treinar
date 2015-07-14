package heranca;

import Encapsulamento.Pessoa;

public class Gerente extends Pessoa {

	public Gerente(String nome) {
		super(nome);
	}

	public int calculaFerias() {
		return 10;
	}
}
