package br.com.collection;

import java.util.Comparator;

import br.com.collection.modelo.Pessoa;

public class ComparadorPessoaNome implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
