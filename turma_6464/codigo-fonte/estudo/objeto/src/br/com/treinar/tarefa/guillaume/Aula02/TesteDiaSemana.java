package br.com.treinar.tarefa.guillaume.Aula02;

import java.util.Scanner;

public class TesteDiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercice 19/01
		//Not good because we need to instanciate dias
		//DiaSemana[] dias = DiaSemana.values();    
		//System.out.println(dias[1].getDescricao());
		
		//exercice 19/01
		DiaSemana esseDia = DiaSemana.getByOrdinal(3);
		
		System.out.println(esseDia.getDescricao());
		System.out.println(esseDia.getComercial());
	}

}
