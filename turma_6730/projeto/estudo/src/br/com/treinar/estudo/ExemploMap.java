package br.com.treinar.estudo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import br.com.treinar.estudo.modelo.Atleta;

public class ExemploMap {

	public static void main(String[] args) {
		Map<Integer, Atleta> mapAtletas = new HashMap<Integer, Atleta>();

		Atleta atletaUm = new Atleta();
		atletaUm.nome = "Atleta 1";
		atletaUm.idade = 34;

		Atleta atletaDois = new Atleta();
		atletaDois.nome = "Atleta 2";
		atletaDois.idade = 34;

		Integer chave33 = 33;
		Integer chave34 = 34;

		mapAtletas.put(chave33, atletaUm);
		mapAtletas.put(chave34, atletaDois);

		// System.out.println(mapAtletas);

		Atleta atleta = mapAtletas.get(chave33);
		System.out.println(atleta);

		Set<Integer> chaves = mapAtletas.keySet();

		System.out.println(chaves);
		
		for (Integer chave : chaves) {
			System.out.println(mapAtletas.get(chave));
		}
		
		Set<Entry<Integer, Atleta>> entrySet = mapAtletas.entrySet();
		for (Entry<Integer, Atleta> entry : entrySet) {
			System.out.println(entry.getValue());
		}

		mapAtletas.containsKey("a");

	}

}
