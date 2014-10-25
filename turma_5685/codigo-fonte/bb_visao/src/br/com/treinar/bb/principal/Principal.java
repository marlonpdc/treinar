package br.com.treinar.bb.principal;

import java.io.IOException;
import java.util.Date;

import br.com.treinar.bb.Cliente;
import br.com.treinar.bb.ContaCorrente;
import br.com.treinar.bb.ContaInvestimento;
import br.com.treinar.bb.ContaPoupanca;
import br.com.treinar.bb.ContaUniversitaria;
import br.com.treinar.bb.controle.BancoControle;
import br.com.treinar.bb.tela.TelaPrincipal;

public class Principal {

	public static void main(String[] args) throws IOException {
		TelaPrincipal tp = new TelaPrincipal();
		moc();
		tp.iniciar();
	}

	private static void moc() {
		ContaCorrente c = new ContaCorrente();
		c.setCliente(new Cliente());
		c.getCliente().setNome("Gleidson");
		c.getCliente().setDataNascimento(new Date());
		c.setCodigo(10481l);
		c.setLimiteCredito(1000d);
		c.setTarifa(19d);

		ContaPoupanca cp = new ContaPoupanca();
		cp.setCliente(new Cliente());
		cp.getCliente().setNome("Raquel");
		cp.getCliente().setDataNascimento(new Date());
		cp.setCodigo(10482l);
		ContaPoupanca.setTaxaRendimento(0.05);

		ContaUniversitaria cu = new ContaUniversitaria();
		cu.setCliente(new Cliente());
		cu.getCliente().setNome("Giovanni");
		cu.getCliente().setDataNascimento(new Date());
		cu.setCodigo(10483l);
		cu.setTarifa(5d);

		ContaInvestimento ci = new ContaInvestimento();
		ci.setCliente(new Cliente());
		ci.getCliente().setNome("Ana Paula");
		ci.getCliente().setDataNascimento(new Date());
		ci.setCodigo(10484l);

		BancoControle controle = new BancoControle();
		controle.cadastrarContaCorrente(c);
		controle.cadastrarContaPoupanca(cp);
		controle.cadastrarContaInvestimento(ci);
		controle.cadastrarContaUniversitaria(cu);

	}
}
