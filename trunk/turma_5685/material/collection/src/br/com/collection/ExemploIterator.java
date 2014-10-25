package br.com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.collection.modelo.Pessoa;

public class ExemploIterator {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Albert");
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
		
		
		Pessoa removido = new Pessoa();
		removido.setNome("Albert");
		
		//pessoas.remove(removido);
		System.out.println("removemos o Albert");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		System.out.println("Até aqui tudo bem");
		
/*		List<Pessoa> removidos = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getNome().startsWith("R")) {
				removidos.add(pessoa);
			}
		}
		pessoas.removeAll(removidos);*/
		
		Iterator<Pessoa> pessoasIt = pessoas.iterator();
		
		while (pessoasIt.hasNext()) {
			Pessoa pessoa = pessoasIt.next();
			if (pessoa.getNome().contains("a")) {
				pessoasIt.remove();
			}
		}
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
		
	}
	
}
