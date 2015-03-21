package gabriel.exemplomap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteMap {
	
	public static void main(String[] args) {
		
		Map<Character, List<String>> map = new HashMap<>();
		for (String nome : args) {
			Character primeiraLetra = nome.charAt(0);
			if (!map.containsKey(primeiraLetra)) {
				map.put(primeiraLetra, new ArrayList<String>());					
			}
			map.get(primeiraLetra).add(nome);
		}
		System.out.println(map);
		
		
	}
	

}
