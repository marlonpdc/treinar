package br.com.treinar.tarefa.matheus;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionList {

	public static void main(String[] args) {
		
		Collection<String> lista = new ArrayList<String>();
		lista.add("Matheus");
		lista.add("Henrique");
		lista.add("Henrique");
		lista.add("Chaves");
		lista.add("Chaves");
		lista.add("Alexandre");
		lista.add("Alexandre");
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		
	}
}
