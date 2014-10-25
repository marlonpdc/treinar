package br.com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeparaNome {

	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<>();
		lista.add("Robson");
		lista.add("Alano");
		lista.add("Albert");
		lista.add("Gabriel");
		lista.add("Raquel");
		lista.add("Gilberto");
		lista.add("Fernando");

		String primeiraLetra = null;
		Map<String, List<String>> nomes = new HashMap<>();
		
		for (String nome : lista) {
			primeiraLetra = nome.substring(0, 1);
			if (!nomes.containsKey(primeiraLetra)) {
				nomes.put(primeiraLetra, new ArrayList<String>());
			}
			nomes.get(primeiraLetra).add(nome);
		}
		System.out.println(nomes);
	}
}
