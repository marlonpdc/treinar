package br.com.treinar.estudo.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.estudo.Pessoa;

public class OrdenarColecao {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "1 Pessoa";
		p1.idade = 10;
		p1.pesoEmGramas = 90000;
		Pessoa p2 = new Pessoa();
		p2.nome = "2 Pessoa";
		p2.idade = 20;
		p2.pesoEmGramas = 30000;
		Pessoa p3 = new Pessoa();
		p3.nome = "3 Pessoa";
		p3.idade = 30;
		p3.pesoEmGramas = 70000;
		Pessoa p4 = new Pessoa();
		p4.nome = "4 Pessoa";
		p4.idade = 40;
		p4.pesoEmGramas = 20000;
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p3);
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p4);

		System.out.println("Sem Ordenar: " + pessoas);		
		Collections.sort(pessoas);
		System.out.println("Ordenado por idade: " + pessoas);
		
		CriterioOrdenacaoPeso criterio = new CriterioOrdenacaoPeso();
		
		//int maior = criterio.compare(p1, p4);
		
		Collections.sort(pessoas, criterio);
		
		System.out.println("Ordenado por peso: " + pessoas);
		
		Collections.sort(pessoas, new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.nome.compareTo(o2.nome);
			}
			
		});
		
		System.out.println("Ordenado por nome: " + pessoas);
		
		
		
	}
	
}
