package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarColecao {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Gleidson");
		nomes.add("Sophia");
		nomes.add("Nathalia");
		nomes.add("Amanda");
		nomes.add("Juan");
		nomes.add("Joca");
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Gleidson");
		p1.setIdade(27);
		p1.setPeso(75D);
		Pessoa p2 = new Pessoa();
		p2.setNome("Sophia");
		p2.setIdade(2);
		p2.setPeso(15D);
		Pessoa p3 = new Pessoa();
		p3.setNome("Nathalia");
		p3.setIdade(10);
		p3.setPeso(35D);
		Pessoa p4 = new Pessoa();
		p4.setNome("Amanda");
		p4.setIdade(8);
		p4.setPeso(16D);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		
		Collections.sort(pessoas);
		
		System.out.println("Implementacao Comparable");
		System.out.println(pessoas);
		
		System.out.println("Implementacao Comparator");
		Collections.sort(pessoas, new ComparadorIdade());

		Collections.sort(pessoas, new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getPeso().compareTo(o2.getPeso());
			}
		});
		
		System.out.println("Classe anonima");
		System.out.println(pessoas);
		
		
	}
	
	
}
