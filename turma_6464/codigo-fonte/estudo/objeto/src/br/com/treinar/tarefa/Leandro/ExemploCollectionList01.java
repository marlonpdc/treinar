package br.com.treinar.tarefa.Leandro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class ExemploCollectionList01 {
	
	public static <E> void main(String[] args) {
		
		Collection<String> lista = new ArrayList<String>();
		@SuppressWarnings("unused")
		Collection<String> lista1 = new HashSet<String>();
		@SuppressWarnings("unused")
		Set<String> lista2 = new HashSet<String>();
		
		lista.add("Leandro");
		lista.add("Douglas");
		lista.add("Silva");
		lista.add("Sandra");
		lista.add("Augusto");
		
		System.out.println(lista.size());
		
		Boolean removido = lista.remove("Douglas");
		
		System.out.println(removido ? "Removido" : "Não Removido");
		
		for (String nome : lista) {
			 
			System.out.println(nome + " " + nome.length() + " Letras ");			
		}
		
		List<String> listaList = (List<String>) lista;
		
		System.out.println(listaList.get(2));
		
		Collection<String> linkedList = new LinkedList<String>();
	
		linkedList.addAll(listaList);
		
		Iterator<String> it = lista.iterator();
		
		while (it.hasNext()) {
			String string = it.next();
			
			if (string.equals("Sandra")) {
				it.remove();                 //Remove objeto dentro de uma coleção usando o iterator.
			}
			
			System.out.println(string);
			
		}
	}

}
