package br.com.treinar.estudo.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import br.com.treinar.estudo.Pessoa;

public class ExemploArrays {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Gleidson";
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Gleidson";
		
		Collection<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.addAll(Arrays.asList(p));
		
		Pessoa[] pessoasArray = new Pessoa[1];
		pessoasArray[0] = p;
		
		List<Pessoa> listPessoas = Arrays.asList(pessoasArray);
		pessoas.addAll(listPessoas);
		
		pessoas.addAll(Arrays.asList(p, p2, p, p2, p, p2));
		
		System.out.println(pessoas.size());
		
	}
	
}
