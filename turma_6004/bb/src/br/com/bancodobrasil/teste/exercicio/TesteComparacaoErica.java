package br.com.bancodobrasil.teste.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bancodobrasil.modelo.Cliente;

public class TesteComparacaoErica {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.nome = "Érica";
		
		Cliente c2 = new Cliente();
		c2.nome = "Gleidson";
		
		Cliente c3 = new Cliente();
		c3.nome = "Adriana";
		
		Cliente c4 = new Cliente();
		c4.nome = "Alanderson";
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		
		System.out.println(clientes);
		CriterioOrdenacaoClienteErica criterio = new CriterioOrdenacaoClienteErica();
		Collections.sort(clientes, criterio);
		System.out.println(clientes);
		
	}

}
