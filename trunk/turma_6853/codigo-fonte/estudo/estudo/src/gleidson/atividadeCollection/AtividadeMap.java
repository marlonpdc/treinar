package gleidson.atividadeCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AtividadeMap {

	public static void main(String[] args) {
		String[] nomesStaticArray = {"Gleidson", "Sophia", "Amanda", "Aline", "Gabriel"};
		List<String> nomes = Arrays.asList(nomesStaticArray);
		Map<Character, List<String>> map = new HashMap<Character, List<String>>();
		for (String nome : nomes) {
			if (!map.containsKey(nome.charAt(0))) {
				map.put(nome.charAt(0), new ArrayList<String>());
			} 
			map.get(nome.charAt(0)).add(nome);
		}
		
		imprimirNomes(map);
		
	}

	private static void imprimirNomes(Map<Character, List<String>> map) {
		Set<Entry<Character, List<String>>> entryNomes = map.entrySet();
		for (Entry<Character, List<String>> entry : entryNomes) {
			System.out.println(entry.getValue());
		}
	}
	
}
