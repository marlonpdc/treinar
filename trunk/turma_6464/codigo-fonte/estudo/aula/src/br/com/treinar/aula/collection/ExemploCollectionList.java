package br.com.treinar.aula.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploCollectionList {

	
	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<String>();
//		Collection<String> lista = new ArrayList<String>();
		
		lista.add("Gleidson");
		lista.add("Sophia");
		lista.add("Nathalia");
		lista.add("Nathalia");
		lista.add("Amanda");
		//lista.add(10l);
		
		System.out.println(lista.get(0));
		
		System.out.println(lista.size());
		
		Boolean removido = lista.remove("Paulo");
		
		System.out.println(removido ? "Removido" : "Não Removido");
		
		//melhor utilizar o iterator
		List<String> removidos = new ArrayList<String>();
		for (String nome : lista) {
			if (nome.contains("a")) {
				removidos.add(nome);
			}
			//lista.remove("Nathalia");
			System.out.println(nome + " " + nome.length() + " Letras");
		}
		lista.removeAll(removidos);
		
		//add novamento os removidos
		lista.add("Sophia");
		lista.add("Nathalia");
		lista.add("Nathalia");
		lista.add("Amanda");
		
		Iterator<String> it = lista.iterator();
		
		System.out.println("Iterator");
		
		while (it.hasNext()) {
			String string = it.next();
			if (string.contains("a")) {
				it.remove();
			}
			System.out.println(string);
		}
		
		for (int i = 0; i < lista.size(); i++) {
			lista.get(i);
		}
		
		List<String> listaList = (List<String>) lista; 
		System.out.println(listaList.get(2));
		
		//Collection<String> linkedList = new LinkedList<String>();
		
		//linkedList.addAll(listaList);
		
		
		System.out.println(lista);
		
	}
	
	
}
