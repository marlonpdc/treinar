package br.com.treinar.humberto;

import java.util.ArrayList;
import java.util.List;

public class ExercicioCollections {
	
	public static void main(String[] args) {
		List<Atleta> atletas = new ArrayList<Atleta>();
		
		Atleta atleta = null;
		
		for (int i = 0; i < 5; i++) {
			atleta = new Atleta();
			atleta.nome = "atleta " + i;
			atleta.idade = (i + 1) * 10;
			atletas.add(i,atleta);
		}
		
		for (int i = 0; i < atletas.size(); i++) {
			System.out.println(atletas.get(i));
		}
		
		System.out.println("--------\nFOR EACH\n--------");
		
		for (Atleta atl : atletas) {
			System.out.println(atl);
		}
		
		
	}

}
