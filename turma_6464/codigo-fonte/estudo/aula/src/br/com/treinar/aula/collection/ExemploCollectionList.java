package br.com.treinar.aula.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ExemploCollectionList {

	
	public static void main(String[] args) {
		
		
		Set<String> lista = new HashSet<String>();
//		Collection<String> lista = new ArrayList<String>();
		
		lista.add("Gleidson");
		lista.add("Sophia");
		lista.add("Nathalia");
		lista.add("Nathalia");
		lista.add("Amanda");
		//lista.add(10l);
		
		System.out.println(lista);
		
		System.out.println(lista.size());
		
		Boolean removido = lista.remove("Paulo");
		
		System.out.println(removido ? "Removido" : "Não Removido");
		
		for (String nome : lista) {
			//lista.remove("Nathalia");
			System.out.println(nome + " " + nome.length() + " Letras");
		}
		
		
		List<String> listaList = (List<String>) lista; 
		System.out.println(listaList.get(2));
		
		Collection<String> linkedList = new LinkedList<String>();
		
		linkedList.addAll(listaList);
		
		Iterator<String> it = lista.iterator();
		System.out.println("Iterator");
		
		while (it.hasNext()) {
			String string = it.next();
			if (string.equals("Nathalia")) {
				it.remove();
			}
			System.out.println(string);
			
		}
		System.out.println(lista);
		
	}
	
	
}
