package estudo.equals;

import estudo.construtor.Pessoa;

public class TesteEquals {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Daniel";
		Pessoa p1 = new Pessoa();
		p1.nome = "Daniel";
		
		System.out.println(p == p1);
		
		Boolean igualByGabriel = p.equals(p1);
	
		System.out.println(igualByGabriel);
	}
	
}
