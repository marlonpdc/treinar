package br.com.treinar.estudo.colecoes;

import java.util.Comparator;

import br.com.treinar.estudo.Pessoa;

public class CriterioOrdenacaoPeso implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		
		return o1.pesoEmGramas - o2.pesoEmGramas;
	}

}
