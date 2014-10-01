package br.com.bancodobrasil.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bancodobrasil.modelo.Cliente;
import br.com.bancodobrasil.modelo.ContaCorrente;
import br.com.bancodobrasil.modelo.banco.Conta;

public class TesteOrdenacao {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("aline");
		nomes.add("amanda");
		nomes.add("bianca");
		nomes.add("luiza");
		nomes.add("amaral");
		
		List<Conta> contas = new ArrayList<Conta>();
		Conta c = new ContaCorrente();
		c.numeroConta = 10l;
		c.proprietario = new Cliente();
		c.proprietario.nome = "Alex";
		
		Conta c1 = new ContaCorrente();
		c1.numeroConta = 100l;
		c1.proprietario = new Cliente();
		c1.proprietario.nome = "Paulo";
		
		Conta c3 = new ContaCorrente();
		c3.numeroConta = 8l;
		c3.proprietario = new Cliente();
		c3.proprietario.nome = "Bruno";
		
		contas.add(c);
		contas.add(c1);
		contas.add(c3);
		
		System.out.println(nomes);		
		Collections.sort(nomes);
		System.out.println(nomes);
		
		System.out.println(contas);		
		Collections.sort(contas);
		System.out.println(contas);
		
		
	}
	
}
