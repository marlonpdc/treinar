package br.com.treinar.aula.collection;

import java.util.Comparator;

import br.com.treinar.aula.dois.Pessoa;

public class CriterioOrdenacaoPessoa implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getCpf().compareTo(o2.getCpf());
	}

}
