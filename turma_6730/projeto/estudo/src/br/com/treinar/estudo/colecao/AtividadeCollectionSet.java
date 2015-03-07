package br.com.treinar.estudo.colecao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import br.com.treinar.estudo.modelo.Atleta;

public class AtividadeCollectionSet {

	public static void main(String[] args) {
		Set<Atleta> atletas = new HashSet<Atleta>();	
		
		Atleta atletaUm = new Atleta();
		atletaUm.nome = "Gleidson 1";
		atletaUm.idade = 34;
		
		atletas.add(atletaUm);
		//atletaUm = null;
		
		Atleta atletaDois = new Atleta();
		atletaDois.nome = "Gleidson 1";
		atletaDois.idade = 34;
		
		atletas.remove(atletaDois);
		
		
		
	}
	
}
