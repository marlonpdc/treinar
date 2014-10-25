package br.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Alano");
		lista.add("Fernando");
		lista.add("Raquel");
		lista.add("Gabriel");
		lista.add("Gilberto");
		
		imprimirLista(lista);
		
		Collections.sort(lista);
		System.out.println("\n");
		imprimirLista(lista);
		
		
	}

	private static void imprimirLista(List<String> lista) {
		for (String nome : lista) {
			System.out.println(nome);
		}
	}
	
}
