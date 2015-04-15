package br.com.treinar.bb.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.ContaCorrente;
import br.com.treinar.bb.modelo.ContaInvestimento;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.StatusConta;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.IPagavel;
import br.com.treinar.bb.modelo.exception.ContaNaoCadastradaException;
import br.com.treinar.bb.modelo.exception.NenhumaContaCadastradaException;
import br.com.treinar.bb.modelo.exception.SemDisponibilidadeException;


public class BBUtil {
	
	
	private List<Conta> contas;
	private static BBUtil instance;
	
	private BBUtil() {
		contas = new ArrayList<Conta>();
	}
	
	static {
		instance = new BBUtil();
	}
	
	public static BBUtil getInstance() {
		return instance;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
	public void adicionarConta(Conta c) throws SemDisponibilidadeException {
		c.setStatusConta(StatusConta.ATIVA);
		this.contas.add(c);
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
	
	public List<Conta> recuperarContas(List<StatusConta> status) throws NenhumaContaCadastradaException {
		List<Conta> contasTemp = new ArrayList<>();
		if (contas.isEmpty()) {
			throw new NenhumaContaCadastradaException();
		}
		for (Conta conta : contas) {
			if (status.contains(conta.getStatusConta())) {
				contasTemp.add(conta);
			}
		}
		return contasTemp;
	}
	
	public void manterContas() throws IOException {
		
		OutputStream os = new FileOutputStream("saida.txt");
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

	public void carregarContas() throws IOException, ParseException {
		InputStream is = new FileInputStream("saida.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine(); // primeira conta
		while (s != null) {
			incluirConta(s);
			s = br.readLine();
		}

		br.close();
	}
	
	private void incluirConta(String contaStr) throws ParseException {
		
		String[] campos = contaStr.split(";");
		
		Conta c = null;
		
		switch (campos[0]) {
		case "ContaCorrente":
			c = new ContaCorrente();
			preencherItensConta((ContaCorrente)c, campos);
			break;
		case "ContaPoupanca":
			c = new ContaPoupanca();
			preencherItensConta((ContaPoupanca)c, campos);
			break;
		case "ContaInvestimento":
			c = new ContaInvestimento();
			preencherItensConta((ContaInvestimento)c, campos);
			break;

		default:
			break;
		}
		preencherItensConta(c, campos);
		contas.add(c);
		
	}
	
	private void preencherItensConta(Conta c, String[] campos) throws ParseException {
		c.setId(Long.parseLong(campos[1]));
		c.setDataAbertura(new SimpleDateFormat("dd/MM/yyyy").parse(campos[2]));
		c.setStatusConta(StatusConta.recuperarPorOrdinal(Integer.parseInt(campos[3])));
		c.setCliente(new Cliente());
		c.getCliente().setId(Long.parseLong(campos[4]));
		c.getCliente().setNome(campos[5]);
		c.getCliente().setCpf(Long.parseLong(campos[6]));
	}

	private void preencherItensConta(ContaCorrente c, String[] campos) {
		c.setLimiteCredito(Double.parseDouble(campos[7]));
		c.setTaxaManutencao(Double.parseDouble(campos[8]));
	}
	
	private void preencherItensConta(ContaPoupanca c, String[] campos) {
		c.setDiaBase(Integer.parseInt(campos[7]));
		ContaPoupanca.setTaxaRendimento(Double.parseDouble(campos[8]));
	}
	
	private void preencherItensConta(ContaInvestimento c, String[] campos) {
		c.setTaxaManutencao(Double.parseDouble(campos[7]));
		c.setTaxaRendimento(Double.parseDouble(campos[8]));
	}
	
	public void excuirConta(Conta c) {
		c.setStatusConta(StatusConta.CANCELADA);
	}

}
