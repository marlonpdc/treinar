package br.com.treinar.bb.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.ContaInvestimento;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.ContaSalario;
import br.com.treinar.bb.modelo.SituacaoConta;
import br.com.treinar.bb.modelo.banco.BBException;
import br.com.treinar.bb.modelo.banco.Conta;

public class DatabaseFile implements IDatabase {

	private static DatabaseFile database;
	private List<Conta> contas;

	private DatabaseFile() {
		super();
		contas = new ArrayList<>();
		moc();
	}

	static {
		database = new DatabaseFile();
	}

	public static DatabaseFile getInstance() {
		return database;
	}

	public Conta[] getContas() {
		Conta[] contasArray = new Conta[contas.size()];
		for (int i = 0; i < contas.size(); i++) {
			contasArray[i] = contas.get(i);
		}
		return contasArray;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void inserirConta(Conta conta) {
		contas.add(conta);
	}

	public Conta selecionar(Long codigoConta) {
		Conta conta = null;
		for (Conta contaTemp : contas) {
			if (contaTemp.getCodigoConta().equals(codigoConta)) {
				conta = contaTemp;
			}
		}
		return conta;
	}

	public void gravarArquivo() {
		OutputStream os;
		try {
			os = new FileOutputStream("contas.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			for (Conta conta : contas) {
				if (conta instanceof ContaCorrente) {
					bw.write(conta.getClass().getName() + ";" + recuperarInformacao((ContaCorrente)conta));
				} else if (conta instanceof ContaPoupanca) {
					bw.write(conta.getClass().getName() + ";" + recuperarInformacao((ContaPoupanca)conta));
				} else if (conta instanceof ContaSalario) {
					bw.write(conta.getClass().getName() + ";" + recuperarInformacao((ContaSalario)conta));
				} else if (conta instanceof ContaInvestimento) {
					bw.write(conta.getClass().getName() + ";" + recuperarInformacao((ContaInvestimento)conta));
				}
				bw.newLine();
			}

			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String recuperarInformacao(Conta c) {
		return c.getCodigoConta() + ";" 
				+ c.getSituacao().ordinal() + ";"
				+ c.getCliente().getCodigo() + ";" 
				+ c.getCliente().getNome()
				+ ";" + c.getCliente().getCpf();
	}

	private String recuperarInformacao(ContaCorrente c) {
		return recuperarInformacao((Conta) c) + ";" + c.getLimiteCredito();
	}

	private String recuperarInformacao(ContaPoupanca c) {
		return recuperarInformacao((Conta) c) + ";" + ContaPoupanca.getTaxaRendimento();
	}

	private String recuperarInformacao(ContaSalario c) {
		return recuperarInformacao((Conta) c) + ";" + c.getQtdSaque();
	}

	private String recuperarInformacao(ContaInvestimento c) {
		return recuperarInformacao((Conta) c) + ";" + c.getRentabilidade();
	}

	private void moc() {
		try {
			ContaCorrente c1 = new ContaCorrente();
			c1.setCliente(new Cliente("Gleidson", 10));
			c1.getCliente().setCodigo(23412L);
			c1.setLimiteCredito(100d);
			c1.setTaxaManutencao(20d);
			c1.depositar(100d);
			c1.setSituacao(SituacaoConta.ATIVA);
			Conta c2 = new ContaPoupanca();
			c2.setCliente(new Cliente("Sophia", 10));
			c2.getCliente().setCodigo(23412L);
			c2.depositar(100d);
			c2.setSituacao(SituacaoConta.ATIVA);
			ContaInvestimento c3 = new ContaInvestimento();
			c3.setCliente(new Cliente("Davi", 10));
			c3.getCliente().setCodigo(23412L);
			c3.setRentabilidade(2);
			c3.setTaxaManutencao(45d);
			c3.depositar(100d);
			c3.setSituacao(SituacaoConta.ATIVA);
			Conta c4 = new ContaSalario();
			c4.setCliente(new Cliente("Maria Clara", 10));
			c4.getCliente().setCodigo(23412L);
			c4.depositar(100d);
			c4.setSituacao(SituacaoConta.ATIVA);
			contas.add(c1);
			contas.add(c2);
			contas.add(c3);
			contas.add(c4);
			
		} catch (Exception e) {
			System.err.println("Erro ao carregar mov");
		}
	}

	@Override
	public void editarConta(Conta conta) throws BBException {
		// TODO implementar
	}

}
