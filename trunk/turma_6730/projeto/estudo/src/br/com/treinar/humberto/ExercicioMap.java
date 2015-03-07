package br.com.treinar.humberto;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExercicioMap {

	public static void main(String[] args) {

		Map<String, String> mapNomes = new HashMap<String, String>();

		mapNomes.put("a", "Amanda");
		mapNomes.put("b", "Bruna");

		Set<Entry<String, String>> entrySet = mapNomes.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getValue());
		}

	}

}
