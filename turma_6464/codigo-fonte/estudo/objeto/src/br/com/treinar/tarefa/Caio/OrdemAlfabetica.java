package br.com.treinar.tarefa.Caio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdemAlfabetica {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Stefanine");
		lista.add("Gleidson");
		lista.add("Gleusa");
		lista.add("Sophia");
		lista.add("Nathalia");
		lista.add("Natalia");
		lista.add("Amanda");
		lista.add("André");
		
		Map<Character, List<String>> alfa = new HashMap<>();
		
		Character primeiraLetra = null;
		for (String nome : lista) {
			primeiraLetra = nome.charAt(0);
			if (!alfa.containsKey(primeiraLetra)) {
				alfa.put(primeiraLetra, new ArrayList<String>());
			}
			alfa.get(primeiraLetra).add(nome);
		}
		
		System.out.println(alfa);

	}
}
