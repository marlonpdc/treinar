package br.com.treinar.estudo.colecoes;

import java.util.ArrayList;
import java.util.Collection;

import br.com.treinar.estudo.Pessoa;

public class ExemploCollection {

	public static void main(String[] args) {
		Collection colecao = new ArrayList();
		
		colecao.add("Gleidson");
		colecao.add(5);
		Pessoa p = new Pessoa();
		p.nome = "Gleidson";
		p.idade = 23;
		colecao.add(p);
		
		for (Object object : colecao) {
			if (object instanceof String) {
				System.out.println(object);
			} else if (object instanceof Integer) {
				
				System.out.println((Integer)object * 5);
			} else if (object instanceof Pessoa) {
				
				System.out.println(((Pessoa)object).nome);
			}
		}
		
		
	}
	
}
