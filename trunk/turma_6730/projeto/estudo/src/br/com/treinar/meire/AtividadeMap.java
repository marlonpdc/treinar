package br.com.treinar.meire;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtividadeMap {

	public static void main(String[] args) {
		Map<String, String> nomes = new HashMap<String, String>();
		nomes.put("A", "Amanda");
		nomes.put("S", "Sophia");
		
		Set<String> chaves = nomes.keySet();
		for (String chave:chaves) {
			System.out.println(nomes.get(chave));
		}
		
	}
}
