package br.com.treinar.estudo.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class AtividadeMap {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList();
		nomes.add("Aline");
		nomes.add("Alberto");
		nomes.add("Antonio");
		nomes.add("Berenice");
		nomes.add("Barcelos");
		nomes.add("Bento");
		nomes.add("Carlos");
		nomes.add("Claudia");
		nomes.add("Couto");
		nomes.add("Douglas");
		nomes.add("Dias");
		nomes.add("Duda");
		nomes.add("Euler");
		nomes.add("Eula");
		nomes.add("Eunice");
		nomes.add("Farias");
		nomes.add("Fabio");
		nomes.add("Fineias");
		nomes.add("Geraldo");
		nomes.add("Genésio");
		nomes.add("Gilson");

		Map<Character, List<String>> mapNomes = new HashMap<Character, List<String>>();

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
