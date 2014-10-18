package br.com.treinar.bb.principal;

import java.util.Date;

import br.com.treinar.bb.Cliente;
import br.com.treinar.bb.ContaCorrente;
import br.com.treinar.bb.ContaInvestimento;
import br.com.treinar.bb.ContaPoupanca;
import br.com.treinar.bb.ContaUniversitaria;
import br.com.treinar.bb.controle.BancoControle;
import br.com.treinar.bb.tela.TelaPrincipal;

public class Principal {

	public static void main(String[] args) {
		TelaPrincipal tp = new TelaPrincipal();
		moc();
		tp.iniciar();
	}

	private static void moc() {
		ContaCorrente c = new ContaCorrente();
		c.cliente = new Cliente();
		c.cliente.nome = "Gleidosn";
		c.cliente.dataNascimento = new Date();
		c.codigo = 10481l;
		c.setLimiteCredito(1000d);
		c.setTarifa(19d);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.cliente = new Cliente();
		cp.cliente.nome = "Raquel";
		cp.cliente.dataNascimento = new Date();
		cp.codigo = 10482l;
		ContaPoupanca.setTaxaRendimento(0.05);
		
		ContaUniversitaria cu = new ContaUniversitaria();
		cu.cliente = new Cliente();
		cu.cliente.nome = "Giovanni";
		cu.cliente.dataNascimento = new Date();
		cu.codigo = 10483l;
		cu.setTarifa(5d);
		
		ContaInvestimento ci = new ContaInvestimento();
		ci.cliente = new Cliente();
		ci.cliente.nome = "Ana Paula";
		ci.cliente.dataNascimento = new Date();
		ci.codigo = 10484l;
		
		BancoControle controle = new BancoControle();
		controle.cadastrarContaCorrente(c);
		controle.cadastrarContaPoupanca(cp);
		controle.cadastrarContaInvestimento(ci);
		controle.cadastrarContaUniversitaria(cu);
		
	}
}
