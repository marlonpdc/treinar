package br.com.bancodobrasil.teste.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bancodobrasil.modelo.Cliente;

public class TesteComparacaoAlanderson {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Alanderson";
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Érica";
		Cliente cliente3 = new Cliente();
		cliente3.nome = "Adriana";
		Cliente cliente4 = new Cliente();
		cliente4.nome = "Gleidson";
		
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		
		System.out.println(clientes);
		Collections.sort(clientes, new CriterioOrdenacaoClienteAlanderson());
		System.out.println(clientes);
		
	}
}
