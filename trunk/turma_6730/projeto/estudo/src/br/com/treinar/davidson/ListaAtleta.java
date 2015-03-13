package br.com.treinar.davidson;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.estudo.modelo.Atleta;

public class ListaAtleta {
	public static void main(String[] args) {
		List<Atleta> atletas = new ArrayList<Atleta>();
		Atleta atleta = new Atleta();

		atleta.idade = 21;
		atleta.nome = "José da Silva";
		
		atletas.add(atleta);
		
		atleta = new Atleta();
		atleta.idade = 23;
		atleta.nome = "Maria da Silva";
		
		atletas.add(atleta);
		
		for (Atleta qualqueCoisa : atletas) {
			
			System.out.println("Nome: " + qualqueCoisa.nome + "\nIdade: " + qualqueCoisa.idade );
			
		}
		
		
	
		
		
		
		
	}
}
/*
 * 
 * 
 * 
 * 
 */
