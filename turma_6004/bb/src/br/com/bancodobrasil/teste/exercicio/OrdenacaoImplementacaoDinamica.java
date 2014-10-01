package br.com.bancodobrasil.teste.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bancodobrasil.modelo.Cliente;

public class OrdenacaoImplementacaoDinamica {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Alanderson";
		cliente1.cpf = 15L;
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Érica";
		cliente2.cpf = 7L;
		Cliente cliente3 = new Cliente();
		cliente3.nome = "Adriana";
		cliente3.cpf = 14L;
		Cliente cliente4 = new Cliente();
		cliente4.nome = "Gleidson";
		cliente4.cpf = 48L;
		
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		System.out.println(clientes);
		Collections.sort(clientes, recuperarCriterio());
		Collections.sort(clientes, new Comparator<Cliente>() {
			@Override
			public int compare(Cliente o1, Cliente o2) {
				return o1.cpf.compareTo(o2.cpf);
			}
		});
		System.out.println(clientes);
		
		
	}

	private static Comparator<Cliente> recuperarCriterio() {
		Comparator<Cliente> comparator = new Comparator<Cliente>() {
			@Override
			public int compare(Cliente o1, Cliente o2) {
				return o1.cpf.compareTo(o2.cpf);
			}
		};
		return comparator;
	}
	
}
