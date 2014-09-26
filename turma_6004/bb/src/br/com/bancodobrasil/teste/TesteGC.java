package br.com.bancodobrasil.teste;

import br.com.bancodobrasil.modelo.Cliente;
import br.com.bancodobrasil.modelo.ContaCorrente;
import br.com.bancodobrasil.modelo.banco.Conta;

public class TesteGC {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		c.depositar(100d);;
		c.proprietario = new Cliente();
		c.proprietario.nome = "Gleidson";
		Cliente p = c.proprietario;
		
		System.out.println(c.proprietario.nome);
		p.nome = "Erica";
		
		System.out.println(c.proprietario.nome);
		
		/*c = null;
		System.out.println(p.nome);
		String nome = p.nome;
		p = null;
		System.out.println(nome);
		nome = null;*/
		
		
		int a = 100;
		int b = a;
		a = 200;
		System.out.println(b);
		
		
		
		
		
		
		
		
		
	}
	
}
