package br.com.treinar.tarefa.marlon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesafioListas {
	
	public static void main(String[] args) {
		
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Amanda");
		nomes.add("Gleidson");
		nomes.add("Sophia");
		nomes.add("Sonia");
		nomes.add("Alex");
		nomes.add("Gabriel");
		nomes.add("Tay");
				
		Map<Character, List<String>> mapaNomes = new HashMap<>();
		
		for (String nome : nomes) {			
			
			Character firstChar = nome.charAt(0);
			
			if(!mapaNomes.containsKey(firstChar)){
				mapaNomes.put(firstChar, new ArrayList<String>());
			}
			
			mapaNomes.get(firstChar).add(nome);
		}
		
		System.out.println(mapaNomes);
	}
	
	

}
