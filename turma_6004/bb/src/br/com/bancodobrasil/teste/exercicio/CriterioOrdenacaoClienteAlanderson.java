package br.com.bancodobrasil.teste.exercicio;

import java.util.Comparator;

import br.com.bancodobrasil.modelo.Cliente;

public class CriterioOrdenacaoClienteAlanderson implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.nome.compareToIgnoreCase(o2.nome);
	}
	

	
	

}
