package estudo.collecton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import estudo.objeto.Pessoa;

public class OrdenarAltura {

	public static void main(String[] args) {
		List<Pessoa> c = new ArrayList<>();
		Pessoa p = new Pessoa();
		p.setNome("Bianca");
		p.setAltura(1);
		Pessoa p2 = new Pessoa();
		p2.setNome("Bianca");
		p2.setAltura(3);
		Pessoa p3 = new Pessoa();
		p3.setNome("Aline");
		p3.setAltura(2);
		c.add(p);
		c.add(p2);
		c.add(p3);
		
		Collections.sort(c, new CriterioComparacaoAltura());
		
		System.out.println(c);
		
		
		Collections.sort(c, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		
		
	}
	
}
