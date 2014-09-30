package br.com.bancodobrasil.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AtividadeDois {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Zara");
		a1.add("Mahnaz");
		a1.add("Ayan");
		System.out.println(" Nomes ");
		System.out.print("\t" + a1);

		List<String> l1 = new LinkedList<>();
		l1.add("Z");
		l1.add("M");
		l1.add("A");
		System.out.println();
		System.out.println(" Primeira letra do Nome");
		System.out.print("\t" + l1);
	}

}

