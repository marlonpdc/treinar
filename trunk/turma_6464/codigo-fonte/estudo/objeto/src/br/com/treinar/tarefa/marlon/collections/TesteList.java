package br.com.treinar.tarefa.marlon.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteList {
	
	public static void main(String[] args) {
				
		Produto produto1 = new Produto("Arroz", 6.50);
		Produto produto2 = new Produto("Feijão", 8.50);
		Produto produto3 = new Produto("Arroz", 3.43);
		Produto produto4 = new Produto("Arroz", 5.33);
		Produto produto5 = new Produto("Arroz", 7.34);
		Produto produto6 = new Produto("Arroz", 61.90);
		Produto produto7 = new Produto("Arroz", 32.32);
		Produto produto8 = new Produto("Arroz", 11.45);
		Produto produto9 = new Produto("Arroz", 32.20);
		Produto produto10 = new Produto("Arroz", 12.);
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		produtos.add(produto6);
		produtos.add(produto7);
		produtos.add(produto8);
		produtos.add(produto9);
		produtos.add(produto10);
		
		
				
	}

}
