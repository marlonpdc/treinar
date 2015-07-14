package br.com.treinar.estudo.colecoes;

import java.util.ArrayList;
import java.util.Collection;

import br.com.treinar.estudo.Pessoa;

public class ExemploCollectionGeneric {

	public static void main(String[] args) {
		
		Collection<Pessoa> colecao = new ArrayList<>();

		//colecao.add("Gleidson");
		//colecao.add(5);
		Pessoa p = new Pessoa();
		p.nome = "Gleidson";
		p.idade = 23;
		colecao.add(p);

		for (Pessoa object : colecao) {
			System.out.println(object.nome);
		}
	}

}
