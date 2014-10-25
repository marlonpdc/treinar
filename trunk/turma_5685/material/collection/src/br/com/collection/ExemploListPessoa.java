package br.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.collection.modelo.Pessoa;

public class ExemploListPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Alano");
		p1.setIdade(4);
		Pessoa p2 = new Pessoa();
		p2.setNome("Fernando");
		p2.setIdade(1);
		Pessoa p3 = new Pessoa();
		p3.setNome("Raquel");
		p3.setIdade(5);
		Pessoa p4 = new Pessoa();
		p4.setNome("Gabriel");
		p4.setIdade(2);
		Pessoa p5 = new Pessoa();
		p5.setNome("Gilberto");
		p5.setIdade(3);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		
		Collections.sort(pessoas);
		
		imprimirPessoa(pessoas);
		ComparadorPessoaNome cpnp = new ComparadorPessoaNome();
		Collections.sort(pessoas, cpnp);
		
		
		Collections.sort(pessoas, new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		
		
		System.out.println("Ordenadas pelo nome da pessoa:");
		imprimirPessoa(pessoas);
		
		
	}

	private static void imprimirPessoa(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
	
}
