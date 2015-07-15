package br.com.treinar.atividade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AtividadeMAP {

	
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Aline");
		nomes.add("Maria Sophia");
		nomes.add("Marta");
		nomes.add("Bruna");
		nomes.add("Matheus");
		nomes.add("Beatriz");
		nomes.add("Nathalia");
		nomes.add("Amanda");
		nomes.add("Juan");
		nomes.add("João Carlos");
		nomes.add("Miguel");
		
		Map<Character, List<String>> mapNomes =	new HashMap<>();
		Character primeiraLetra = null;
		for (String nome : nomes) {
			primeiraLetra = nome.charAt(0);
			if (!mapNomes.containsKey(primeiraLetra)) {
				mapNomes.put(primeiraLetra, new ArrayList<String>());
			}
			mapNomes.get(primeiraLetra).add(nome);
		}
		
		System.out.println(mapNomes);
	}
	
}
