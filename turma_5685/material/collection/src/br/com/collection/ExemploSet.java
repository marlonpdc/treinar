package br.com.collection;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();
		
		nomes.add("g");
		nomes.add("n");
		nomes.add("n");
		nomes.add("m");
		nomes.add("k");
		nomes.add("o");
		nomes.add("e");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
	}
	
}
