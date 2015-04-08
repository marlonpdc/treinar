package br.com.treinar.bb.modelo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.IPagavel;
import br.com.treinar.bb.modelo.exception.ContaNaoCadastradaException;
import br.com.treinar.bb.modelo.exception.NenhumaContaCadastradaException;
import br.com.treinar.bb.modelo.exception.SemDisponibilidadeException;


public class BBUtil {
	
	
	private Conta[] contas;
	private Integer index;

	private static BBUtil instance;
	
	private BBUtil() {
		index = 0;
		contas = new Conta[10];
	}
	
	static {
		instance = new BBUtil();
	}
	
	public static BBUtil getInstance() {
		return instance;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}
	
	
	public void adicionarConta(Conta c) throws SemDisponibilidadeException {
		if (index < contas.length) {
			c.setStatusConta(StatusConta.ATIVA);
			this.contas[index++] = c;			
		} else {
			throw new SemDisponibilidadeException();
		}
	}
	

	public Conta recuperarConta(Long id) throws ContaNaoCadastradaException {
		Conta c = null;
		for (Conta conta : contas) {
			if (conta.getId().equals(id)) {
				c = conta;
				break;
			}
		}
		if (c == null) {
			throw new ContaNaoCadastradaException();
		}
		return c;
	}

	public void captalizar() {
		for (Conta conta : contas) {
			if (conta instanceof ICaptalizavel) {
				captalizar((ICaptalizavel)conta);
			}
		}
	}
	
	private void captalizar(ICaptalizavel captalizavel) {
		captalizavel.captalizar();
	}

	public void cobrarTarifa() {
		for (Conta conta : contas) {
			if (conta instanceof IPagavel) {
				tarifar((IPagavel)conta);
			}
		}
	}

	private void tarifar(IPagavel pagavel) {
		pagavel.pagar();
	}
	
	public Conta[] recuperarContas() throws NenhumaContaCadastradaException {
		Boolean possuiConta = Boolean.FALSE;
		for (Conta conta : contas) {
			if (conta != null) {
				possuiConta = Boolean.TRUE;
			}
		}
		if (!possuiConta) {
			throw new NenhumaContaCadastradaException();
		}
		return contas;
	}
	
	public void manterContas() throws IOException {
		
		OutputStream os = new FileOutputStream("saida.txt", Boolean.TRUE);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		for (Conta conta : contas) {
			if (conta != null) {
				gravarConta(conta, bw);
				if (conta instanceof ContaCorrente) {
					gravarConta((ContaCorrente)conta, bw);
				} else if (conta instanceof ContaPoupanca) {
					gravarConta((ContaPoupanca)conta, bw);				
				} else if (conta instanceof ContaInvestimento) {
					gravarConta((ContaInvestimento)conta, bw);								
				}
				bw.newLine();
			}
		}

		bw.close();
		
	}

	private void gravarConta(Conta conta, BufferedWriter bw) throws IOException {
		bw.write(conta.getClass().getSimpleName());
		bw.write(";");
		bw.write(conta.getId().toString());
		bw.write(";");
		bw.write(new SimpleDateFormat("dd/MM/yyyy").format(conta.getDataAbertura()));
		bw.write(";");
		bw.write(Integer.valueOf(conta.getStatusConta().ordinal()).toString());
		bw.write(";");
		bw.write(conta.getCliente().getId().toString());
		bw.write(";");
		bw.write(conta.getCliente().getNome());
		bw.write(";");
		bw.write(conta.getCliente().getCpf().toString());
		bw.write(";");
	}
	
	private void gravarConta(ContaCorrente conta, BufferedWriter bw) throws IOException {
		bw.write(conta.getLimiteCredito().toString());
		bw.write(";");
		bw.write(conta.getTaxaManutencao().toString());
		bw.write(";");
	}
	
	private void gravarConta(ContaPoupanca conta, BufferedWriter bw) throws IOException {		
		bw.write(conta.getDiaBase());
		bw.write(";");
		bw.write(ContaPoupanca.getTaxaRendimento().toString());
		bw.write(";");
	}
	
	private void gravarConta(ContaInvestimento conta, BufferedWriter bw) throws IOException {
		bw.write(conta.getTaxaManutencao().toString());
		bw.write(";");		
		bw.write(conta.getTaxaRendimento().toString());
		bw.write(";");		
	}

}
