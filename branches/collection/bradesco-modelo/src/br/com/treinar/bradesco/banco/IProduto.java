package br.com.treinar.bradesco.banco;

import java.util.Date;

import br.com.treinar.bradesco.Titular;

public interface IProduto {

	Titular getTitular();
	
	void setTitular(Titular titular);
	
	Date dataAquisicao();
	
	
}
