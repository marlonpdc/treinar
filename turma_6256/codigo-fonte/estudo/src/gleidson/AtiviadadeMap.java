package gleidson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AtiviadadeMap {

	public static void main(String[] args) {
		Map<Character, List<String>> nomes = new HashMap<>();
		Character letraInicial = null;
		for (String nome : args) {
			letraInicial = nome.charAt(0);
			if (!nomes.containsKey(letraInicial)) {
				nomes.put(letraInicial, new ArrayList<String>());
			}
			nomes.get(letraInicial).add(nome);
		}
		System.out.println(nomes);
		
		//Impressao for de key
		Set<Character> keys = nomes.keySet();
		for (Character character : keys) {
			System.out.println(nomes.get(character));
		}
		
		Set<Entry<Character, List<String>>> itensMapa = nomes.entrySet();
		for (Entry<Character, List<String>> entry : itensMapa) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
