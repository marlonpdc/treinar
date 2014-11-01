package net.gabriellima.desafio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Desafio {
	
	public static void main(String[] args) {
		Map<String, List<String>> turma = new HashMap<>();
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Robson");
		nomes.add("Alano");
		nomes.add("Albert");
		nomes.add("Gabriel");
		nomes.add("Raquel");
		nomes.add("Gilberto");
		nomes.add("Fernando");
		
		String letra = null;
		for (String nome : nomes) {
			letra = nome.substring(0, 1);
			if (!turma.containsKey(letra)) {
				turma.put(letra, new ArrayList<String>());
			}
			turma.get(letra).add(nome);
		}
		
		System.out.println(turma);
		
	}

}
