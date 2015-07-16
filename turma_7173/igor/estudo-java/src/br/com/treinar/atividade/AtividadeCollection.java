package br.com.treinar.atividade;

import java.util.ArrayList;
import java.util.Collection;

public class AtividadeCollection {

	public static void main(String[] args) {
		
		Collection<Monitor> colecao = new ArrayList<>();
		
		Monitor monitor = new Monitor();
		
		monitor.cor = "Preto";
		monitor.marca = "Lg";
		
		colecao.add(monitor);
		
		for (Monitor m : colecao) {
			System.out.println(m.cor +"\n"+ m.marca);
		}	
	}	
}
