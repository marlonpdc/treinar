package br.com.bancodobrasil.teste.exercicio;

import java.util.Comparator;

import br.com.bancodobrasil.modelo.Cliente;

public class CriterioOrdenacaoAdriana implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.nome.compareTo(o2.nome);
	}

}
