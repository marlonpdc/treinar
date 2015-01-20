package br.com.treinar.tarefa.emerson;

import java.util.ArrayList;
import java.util.Collections;

public class TreinandoArrayLits {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("Emerson");
		nomes.add("Cristh");
		nomes.add("Silvia");
		nomes.add("Laurinda");
		
		System.out.println(nomes +"\n" );
		Collections.sort(nomes );
		System.out.println(nomes +"\n" );
		Collections.reverse(nomes);
		System.out.println(nomes +"\n");
		System.out.println(nomes.size());
		

		Boolean removido = nomes.remove("Laurinda");

		System.out.println(removido ? "Removido" : "Não removido");

		for (int i = 0; i < nomes.size(); i++) {
			String lista = nomes.get(i);
			System.out.println(nomes.equals("Emerson"));
		}





	}

}
