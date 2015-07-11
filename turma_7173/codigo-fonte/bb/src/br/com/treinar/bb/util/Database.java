package br.com.treinar.bb.util;

import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.ContaInvestimento;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.ContaSalario;
import br.com.treinar.bb.modelo.banco.Conta;

public class Database {

	private static Database database;
	private Conta[] contas;
	private Integer indice;

	private Database() {
		super();
		indice = 0;
		contas = new Conta[10];
		moc();
	}

	static {
		database = new Database();
	}

	public static Database getInstance() {
		return database;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}
	
	public Boolean inserirConta(Conta conta) {
		Boolean adicionou = Boolean.FALSE;
		if (indice < contas.length) {
			contas[indice++] = conta;
			adicionou = Boolean.TRUE;
		}
		return adicionou;
	}

	public Conta selecionar(Long codigoConta) {
		Conta c = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].getCodigoConta().equals(codigoConta)) {
				c = contas[i];
				break;
			}
		}
		return c;
	}
	
	
	private void moc() {
		ContaCorrente c1 = new ContaCorrente();
		c1.setCliente(new Cliente("Gleidson", 10));
		c1.getCliente().setCodigo(23412L);
		c1.setLimiteCredito(100d);
		c1.setTaxaManutencao(20d);
		c1.depositar(100d);
		Conta c2 = new ContaPoupanca();
		c2.setCliente(new Cliente("Sophia", 10));
		c2.getCliente().setCodigo(23412L);
		c2.depositar(100d);
		ContaInvestimento c3 = new ContaInvestimento();
		c3.setCliente(new Cliente("Davi", 10));
		c3.getCliente().setCodigo(23412L);
		c3.setRentabilidade(2);
		c3.setTaxaManutencao(45d);
		c3.depositar(100d);
		Conta c4 = new ContaSalario();
		c4.setCliente(new Cliente("Maria Clara", 10));
		c4.getCliente().setCodigo(23412L);
		c4.depositar(100d);
		contas[0] = c1;
		contas[1] = c2;
		contas[2] = c3;
		contas[3] = c4;
		indice = 4;
	}


}
