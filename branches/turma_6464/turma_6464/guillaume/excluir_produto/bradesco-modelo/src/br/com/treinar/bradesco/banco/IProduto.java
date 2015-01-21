package br.com.treinar.bradesco.banco;

import java.util.Date;

import br.com.treinar.bradesco.Titular;

public interface IProduto {

	Titular getTitular();
	
	Date getDataAquisicao();
	
	Long getCodigo();
	
}
