package estudo;

import estudo.construtor.Pessoa;

public class Referencia {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("");
		p.nome = "Gabriel";
		
		Pessoa p2 = new Pessoa("");
		p2.nome = "Bruno";
		System.out.println(p2.nome);
		
		Pessoa p3 = p;
		System.out.println(p3.nome);
		
		p3.nome = "Daniel";
		System.out.println(p.nome);
		
		p = null;
		p3 = null;
		System.gc();
		
	}
	
}
