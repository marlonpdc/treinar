package br.com.treinar.estudo.colecao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.treinar.estudo.modelo.Atleta;

public class AtividadeCollectionList {

	public static void main(String[] args) {
		List<Atleta> atletas = new ArrayList<Atleta>();	
		
		Atleta atletaUm = new Atleta();
		atletaUm.nome = "Gleidson 1";
		atletaUm.idade = 34;
		
		atletas.add(atletaUm);
		
		Atleta atletaDois = new Atleta();
		atletaDois.nome = "Gleidson 2";
		atletaDois.idade = 34;
		
		atletas.add(atletaDois);
		
		
		System.out.println(atletas.contains(atletaDois));
		System.out.println(atletas);
		
		for (int i = 0; i < atletas.size(); i++) {
			atletas.clear();
		}

		System.out.println(atletas);
		
		Iterator<Atleta> itAtletas = atletas.iterator();
		
		while (itAtletas.hasNext()) {
			Atleta type = itAtletas.next();
			System.out.println(type);
			itAtletas.remove();
		}
		
	}
	
}
