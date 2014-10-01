package br.com.bancodobrasil.teste;

import java.util.Comparator;

import br.com.bancodobrasil.modelo.banco.Conta;

public class CriterioOrdenacaoConta implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		return o1.proprietario.nome.compareToIgnoreCase(o2.proprietario.nome);
	}

}
