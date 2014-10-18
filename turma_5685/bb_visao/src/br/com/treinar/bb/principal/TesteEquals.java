package br.com.treinar.bb.principal;

import br.com.treinar.bb.Cliente;

public class TesteEquals {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Gleidson");
		
		Cliente c2 = new Cliente();
		c2.setNome("Gleidson");
		
		Cliente c3 = c1;
		System.out.println("C1 e C2: " + c1.equals(c2));
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c3);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
	
}
