package br.com.bancodobrasil.teste.exercicio;

import java.util.Comparator;

import br.com.bancodobrasil.modelo.Cliente;

public class CriterioOrdenacaoClienteErica implements Comparator<Cliente> {

	@Override
	public int compare(Cliente cliente01, Cliente cliente02) {
		return cliente01.nome.compareTo(cliente02.nome);
	}
	
}


