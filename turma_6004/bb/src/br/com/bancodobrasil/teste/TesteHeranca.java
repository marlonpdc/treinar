package br.com.bancodobrasil.teste;

import br.com.bancodobrasil.modelo.Cliente;
import br.com.bancodobrasil.modelo.ContaCorrente;
import br.com.bancodobrasil.modelo.ContaPoupanca;
import br.com.bancodobrasil.modelo.Pacote;
import br.com.bancodobrasil.modelo.banco.Conta;

public class TesteHeranca {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.proprietario = new Cliente();
		cc.depositar(100d);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.proprietario = new Cliente();
		cp.depositar(10000d);
		
		Conta c = new ContaPoupanca();
		
		((ContaCorrente)c).pacote = new Pacote();
		
		
		//c.pacote
		//ContaCorrente ctaCorrente = new Conta();
		
		
		System.out.println(cc.recuperarSaldo());
		System.out.println(cp.recuperarSaldo());
		
		
	}
	
}
