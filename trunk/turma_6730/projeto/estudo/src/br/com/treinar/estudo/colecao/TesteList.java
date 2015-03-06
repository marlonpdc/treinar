package br.com.treinar.estudo.colecao;

import java.util.ArrayList;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		List<String> colecao = new ArrayList<String>();
		
		colecao.add("Gleidson");
		colecao.add("Gleidson");
		//colecao.add(10);
		//colecao.add(true);
		
		String nome = colecao.get(0);
		
		for (Object object : colecao) {
			System.out.println(object);
		}
		
		System.out.println(colecao.get(3));
		
		colecao.add(1, "1");
		
		System.out.println(colecao);
		
		colecao.remove(0);
		
		System.out.println(colecao);
		
	}
	
}
