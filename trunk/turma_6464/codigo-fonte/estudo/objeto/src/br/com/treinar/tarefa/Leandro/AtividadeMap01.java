package br.com.treinar.tarefa.Leandro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AtividadeMap01 {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		
		Map<Character, List<String>> mapNomes = new HashMap<Character, List<String>>();
		
		Character key = null;
		
		nomes.add("Augusto");
		nomes.add("Roberto");
		nomes.add("Carlos");
		nomes.add("Ricardo");
		nomes.add("Antero");
		nomes.add("Camila");
		nomes.add("Paulo");
		nomes.add("Pedro");
		nomes.add("Carlaile");
		
		for (String nome : nomes) {
			
			key = nome.charAt(0);
			if (!mapNomes.containsKey(key)) {
				mapNomes.put(key, new ArrayList<String>());
			}
			mapNomes.get(key).add(nome);
		}		
		System.out.println(mapNomes);
	
	}

}
