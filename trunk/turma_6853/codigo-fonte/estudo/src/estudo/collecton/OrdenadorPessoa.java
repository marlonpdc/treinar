package estudo.collecton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import estudo.objeto.Pessoa;

public class OrdenadorPessoa {

	public static void main(String[] args) {
		List<Pessoa> c = new ArrayList<>();
		Pessoa p = new Pessoa();
		p.setNome("Bianca");
		p.setAltura(1);
		Pessoa p2 = new Pessoa();
		p2.setNome("Amanda");
		p2.setAltura(3);
		Pessoa p3 = new Pessoa();
		p3.setNome("Aline");
		p3.setAltura(2);
		
		c.add(p);
		c.add(p2);
		c.add(p3);
		
		Collections.sort(c);
		
		
		System.out.println(c);

	}
	
}
