package br.com.bancodobrasil.teste.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bancodobrasil.modelo.Cliente;

public class TesteOrdenacaoClienteAdriana {
	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();

		Cliente c = new Cliente();
		c.nome = "joao";

		Cliente c1 = new Cliente();
		c1.nome = "carla";

		Cliente c2 = new Cliente();
		c2.nome = "beatriz";

		Cliente c3 = new Cliente();
		c3.nome = "vagner";

		Cliente c4 = new Cliente();
		c4.nome = "hugo";

		clientes.add(c);
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);

		CriterioOrdenacaoAdriana criterio = new CriterioOrdenacaoAdriana();
		System.out.println(clientes);
		Collections.sort(clientes, criterio);
		System.out.println(clientes);


	}
}
