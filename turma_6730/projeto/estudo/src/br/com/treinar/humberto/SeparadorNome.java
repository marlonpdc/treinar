package br.com.treinar.humberto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SeparadorNome {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		Map<String, List<String>> nomesSeparados = new HashMap<String, List<String>>();
		String primeiraLetra = null;
		
		nomes.add("Afonso Hamm (PP-RS)");
		nomes.add("Eduardo da Fonte (PP-PE)"); 
		nomes.add("Aníbal Gomes (PMDB-CE)");
		nomes.add("Dilceu Sperafico (PP-PR)");
		nomes.add("Lázaro Botelho (PP-TO)");
		nomes.add("Eduardo Cunha (PMDB-RJ)");
		nomes.add("Jerônimo Goergen (PP-RS)");
		nomes.add("Nelson Meurer (PP-PR)");
		nomes.add("Aguinaldo Ribeiro (PP-PB)");
		nomes.add("Luiz Fernando Faria (PP-MG)");
		nomes.add("Missionário José Olimpio (PP-SP)");
		nomes.add("José Otávio Germano (PP-RS)");
		nomes.add("Roberto Balestra (PP-GO)");
		nomes.add("Roberto Britto (PP-BA)");
		nomes.add("Arthur Lira (PP-AL)");
		nomes.add("Luís Carlos Heinze (PP-RS)");
		nomes.add("Waldir Maranhão PP-MA)");
		nomes.add("Renato Molling (PP-RS)");
		nomes.add("Sandes Júnior (PP-GO)");
		nomes.add("José Mentor (PT-SP)");
		nomes.add("Simão Sessim (PP-RJ)");
		nomes.add("Vander Loubet (PT-MS)");
		
		for (String nome : nomes) {
			primeiraLetra = nome.substring(0, 1);
			if (!nomesSeparados.containsKey(primeiraLetra)) {
				nomesSeparados.put(primeiraLetra, new ArrayList<String>());
			}
			nomesSeparados.get(primeiraLetra).add(nome);
		}
		
//		System.out.println(nomesSeparados);
		
		Set<Entry<String, List<String>>> entrySet = nomesSeparados.entrySet();
		for (Entry<String, List<String>> entry : entrySet) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
	}

	
}


