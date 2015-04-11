package br.com.treinar.itau.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.annotation.PostConstruct;

import br.com.treinar.itau.exception.ContaNaoCadastradaException;
import br.com.treinar.itau.modelo.ContaCorrente;
import br.com.treinar.itau.modelo.ContaInvestimento;
import br.com.treinar.itau.modelo.ContaPoupanca;
import br.com.treinar.itau.modelo.ContaSalario;
import br.com.treinar.itau.modelo.principal.Conta;
import br.com.treinar.itau.modelo.principal.Pessoa;

public class ItauUtil extends Object {

	private static ItauUtil instance;
	private DateFormat formatadorData;

	public Conta[] contas;
	private Integer index;

	private ItauUtil() {
		init();
	}

	@PostConstruct
	private void init() {
		index = 0;
		contas = new Conta[100];
		formatadorData = new SimpleDateFormat("dd/MM/yyyy");
	}

	static {
		instance = new ItauUtil();		
	}

	public static ItauUtil getInstance() {
		return instance;
	}

	public void adicionarConta(Conta c) {
		if (index == contas.length) {
			aumentarVetor();
		}
		contas[index++] = c;
	}

	public Conta recuperar(Integer numeroConta) throws ContaNaoCadastradaException {
		Conta conta = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].getNumeroConta().equals(numeroConta)) {
				conta = contas[i];
				break;
			}
		}
		if (conta == null) {
			throw new ContaNaoCadastradaException();
		}
		return conta;
	}

	public Conta[] recuperar() {
		return contas;
	}

	public void remover(Conta conta) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].equals(conta)) {
				//				if (contas.length - 1 == i) {
				//					contas[i] = null;								
				//				} else if(contas.length - 2 == i) {					
				//					contas[contas.length - 2] = contas[contas.length - 1];								
				//					contas[contas.length - 1] = null;								
				//				} else {
				//					for (int j = i + 1; j < index; j++) {
				//						contas[i] = contas[j];					
				//					}					
				//				}
				contas[i] = null;
				realocar();
				break;
			}
		}
	}

	private void realocar() {
		Conta contasTemp[] = new Conta[contas.length];
		int j = 0;

		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				contasTemp[j++] = contas[i];
			}
		}
		contas = contasTemp;
		index = j;
	}

	private void aumentarVetor() {
		Conta contasTemp[] = new Conta[contas.length * 2];
		for (int i = 0; i < contas.length; i++) {
			contasTemp[i] = contas[i];
		}
		contas = contasTemp;
	}

	public void persistirContas() {
		try {
			OutputStream os = new FileOutputStream("contas.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(ContaPoupanca.taxaRendimento.toString());
			bw.write(";\n");
			
			for (Conta conta : contas) {
				if (conta != null) {
					preencherDadosConta(conta, bw);
					if (conta instanceof ContaCorrente) {
						preencherDadosConta((ContaCorrente)conta, bw);
					} else if (conta instanceof ContaPoupanca) {
						preencherDadosConta((ContaPoupanca)conta, bw);						
					} else if (conta instanceof ContaInvestimento) {
						preencherDadosConta((ContaInvestimento)conta, bw);						
					} else if (conta instanceof ContaSalario) {
						preencherDadosConta((ContaSalario)conta, bw);						
					}
				}
				bw.write("\n");
			}
			bw.close();
		} catch (Exception e) {
			System.out.println("erro");
		}
	}
	
	private void preencherDadosConta(Conta c, BufferedWriter bw) throws IOException {
		bw.write(c.getClass().getSimpleName());
		bw.write(";");
		bw.write(c.getNumeroConta().toString());
		bw.write(";");
		bw.write(c.getPessoa().getNome());
		bw.write(";");
	}

	private void preencherDadosConta(ContaCorrente c, BufferedWriter bw) throws IOException {
		bw.write(c.tarifa.toString());
		bw.write(";");
		bw.write(c.limiteCredito.toString());
		bw.write(";");
	}
	
	private void preencherDadosConta(ContaPoupanca c, BufferedWriter bw) throws IOException {
		bw.write(c.diaBaseDeposito.toString());
		bw.write(";");
	}
	
	private void preencherDadosConta(ContaSalario c, BufferedWriter bw) throws IOException {
		bw.write(formatadorData.format(c.dataCreditoSalario));
		bw.write(";");
	}
	
	private void preencherDadosConta(ContaInvestimento c, BufferedWriter bw) throws IOException {
		bw.write(c.tarifa.toString());
		bw.write(";");
		bw.write(c.fatorCaptalizacao.toString());
		bw.write(";");
		bw.write(formatadorData.format(c.getDataInicioInvestimento()));
		bw.write(";");
	}

	

	public void carregarContas() {
		try {
			InputStream is = new FileInputStream("contas.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String contaStr = br.readLine();
			preencherAtributosStatic(contaStr.split(";"));
			contaStr = br.readLine();
			String campos[] = null;
			Integer i = 0;
			Conta c = null;
			while (contaStr != null) {
				campos = contaStr.split(";");
				switch (campos[0]) {
					case "ContaCorrente":
						c = new ContaCorrente(Integer.parseInt(campos[1]));
						criarConta((ContaCorrente)c, campos);
						break;
					case "ContaPoupanca":
						c = new ContaPoupanca(Integer.parseInt(campos[1]));
						criarConta((ContaPoupanca)c, campos);
						break;
					case "ContaSalario":
						c = new ContaSalario(Integer.parseInt(campos[1]));
						criarConta((ContaSalario)c, campos);
						break;
					case "ContaInvestimento":
						c = new ContaInvestimento(Integer.parseInt(campos[1]));
						criarConta((ContaInvestimento)c, campos);
						break;
				default:
					break;
				}
				contas[i++] = c;
				contaStr = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void criarConta(Conta c, String[] campos) {
		c.setPessoa(new Pessoa());
		c.getPessoa().setNome(campos[2]);
	}
	
	private void criarConta(ContaCorrente c, String[] campos) {
		criarConta((Conta)c, campos);
		c.tarifa = Double.valueOf(campos[3]);
		c.limiteCredito = Double.parseDouble(campos[4]);
	}
	private void criarConta(ContaPoupanca c, String[] campos) {
		criarConta((Conta)c, campos);
		c.diaBaseDeposito = Integer.parseInt(campos[3]);
	}
	
	private void criarConta(ContaSalario c, String[] campos) throws ParseException {
		criarConta((Conta)c, campos);
		c.dataCreditoSalario = formatadorData.parse(campos[3]);
	}
	
	private void criarConta(ContaInvestimento c, String[] campos) throws ParseException {
		criarConta((Conta)c, campos);
		c.tarifa = Double.parseDouble(campos[3]);
		c.fatorCaptalizacao = Integer.valueOf(campos[4]);
		c.setDataInicioInvestimento(formatadorData.parse(campos[5]));
	}

	private void preencherAtributosStatic(String[] campos) {
		ContaPoupanca.taxaRendimento = Float.valueOf(campos[0]);
	}

}
