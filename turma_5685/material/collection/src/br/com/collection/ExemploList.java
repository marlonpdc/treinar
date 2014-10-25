package br.com.collection;

import java.util.ArrayList;
import java.util.List;

import br.com.collection.modelo.Pessoa;

public class ExemploList {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Gleidson");
		List<String> lista = new ArrayList<>();
		lista.add("Gleidson");
		//lista.add(pessoa);
		//lista.add(10);
		lista.add("Gleidson");
		//lista.add(10l);
		int num = 10;
		Integer wNum = num;
		//lista.add(num);
		
		//System.out.println(lista.size());
		for (int i = 0; i < lista.size(); i++) {
			//System.out.println(lista.get(i));
		}
		
		String nome = lista.get(1);
		
		
	}
	
}
