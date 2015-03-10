package br.com.treinar.humberto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoColecoes {
	
	public static void main(String[] args) {
		List<Atleta> atletas = new ArrayList<Atleta>();
				
		Atleta a1 = new Atleta ("Afonso Hamm (PP-RS)", 50, 2);
		Atleta a2 = new Atleta ("Eduardo da Fonte (PP-PE)", 55, 1); 
		Atleta a3 = new Atleta ("Aníbal Gomes (PMDB-CE)", 58, 1);
		Atleta a4 = new Atleta ("Dilceu Sperafico (PP-PR)", 40, 3);
		Atleta a5 = new Atleta ("Lázaro Botelho (PP-TO)", 32, 2);
		
		atletas.add(a1);
		atletas.add(a2);
		atletas.add(a3);
		atletas.add(a4);
		atletas.add(a5);
		
		Collections.sort(atletas);
		
		
		for (int i = 0; i < atletas.size(); i++) {
			System.out.println(atletas.get(i));
		}
		
		System.out.println("---------foreach");
		
		for (Atleta atleta : atletas) {
			System.out.println(atleta);
		}
		
		CriterioOrdenacaoVelocidade criterio = new CriterioOrdenacaoVelocidade();
		
		Collections.sort(atletas, criterio);
		
		for (Atleta atleta : atletas) {
			System.out.println(atleta);
		}
		
		
	}
	

}
