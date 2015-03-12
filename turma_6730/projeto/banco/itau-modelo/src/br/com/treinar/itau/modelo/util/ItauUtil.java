package br.com.treinar.itau.modelo.util;

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
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.treinar.itau.modelo.ContaCorrente;
import br.com.treinar.itau.modelo.ContaInvestimento;
import br.com.treinar.itau.modelo.ContaPoupanca;
import br.com.treinar.itau.modelo.banco.Conta;
import br.com.treinar.itau.modelo.banco.ICaptalizavel;
import br.com.treinar.itau.modelo.banco.INotificavel;
import br.com.treinar.itau.modelo.banco.ITarifavel;
import br.com.treinar.itau.modelo.banco.ItauException;
import br.com.treinar.itau.modelo.banco.Pessoa;


public class ItauUtil {

	private Conta[] contas;
	private Integer indice;
	private static ItauUtil instance;
	
	private ItauUtil() {
		super();
		contas = new Conta[5];
		indice = 0;
	}
	
	static {
		instance = new ItauUtil();
	}
	
	public static ItauUtil getInstance() {
		return instance;
	}
	
	public String formatarData(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(data);
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}
	
	public Boolean adicionarConta(Conta conta) {
		Boolean rolou = Boolean.FALSE;
		if (indice < 5) {
			contas[indice++] = conta;
			rolou = Boolean.TRUE;
		}
		return rolou;
	}
	
	public Conta recuperarConta(Integer numeroConta) throws ItauException {
		Conta contaEncontrada = null;
		for (Conta conta : contas) {
			if (conta != null && conta.getNumeroConta().equals(numeroConta)) {
				contaEncontrada = conta;
				break;
			}
		}
		if (contaEncontrada == null) {
			throw new ItauException("Conta não encontrada");
		}
		return contaEncontrada;
		
	}

	public void tarifarContas() {
		for (Conta conta : contas) {
			if (conta instanceof ITarifavel) {
				ITarifavel contaTarifavel = (ITarifavel) conta;
				tarifar(contaTarifavel);
			}			
		}
	}
	
	private void tarifar(ITarifavel contaTarifavel) {
		contaTarifavel.cobrarTarifa();
	}

	public void captalizarContas() {
		for (Conta conta : contas) {
			if (conta instanceof ICaptalizavel) {
				ICaptalizavel contaCaptalizavel = (ICaptalizavel) conta;
				captalizar(contaCaptalizavel);	
			}
		}
	}
	
	private void captalizar(ICaptalizavel contaCaptalizavel) {
		contaCaptalizavel.captalizar();
	}

	public Conta[] recuperarContas() {
		Integer quantidadeContas = 0;
		Conta[] contasTemp = null;
		for (Conta conta : this.contas) {
			if (conta != null) {
				quantidadeContas++;
			}
		}
		contasTemp = new Conta[quantidadeContas];
		for (int i = 0; i < this.contas.length; i++) {
			if (this.contas[i] != null) {
				contasTemp[i] = contas[i];
			}
		}
		return contasTemp;
	}

	public void deletarConta(Conta conta) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i].equals(conta)) {
				contas[i] = null;
				break;
			}
		}
	}
	
	public String recuperarPrimeiraLetra(String texto) {
		return texto.substring(0, 1);
	}
	
	public void notificarGerencia(INotificavel notificavel) {
		System.out.println(notificavel.getEmail() + " " + notificavel.getMensagem());
	}
	
	public void gravarContas() throws IOException {
		OutputStream os = new FileOutputStream("contas.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		for (Conta conta : contas) {
			if (conta != null) {
				bw.write(conta.getNumeroConta().toString());
				bw.write(";");
				bw.write(conta.getSaldo().toString());
				bw.write(";");
				bw.write(conta.getPessoa().nome);
				bw.write(";");
				bw.write(conta.getPessoa().cpf.toString());
				bw.write(";");				
				
				String tipoConta = conta.getClass().getSimpleName();
				switch (tipoConta) {
				case "ContaCorrente":
					gravarContaCorrente(bw, (ContaCorrente) conta);
					break;
				case "ContaPoupanca":
					gravarContaPoupanca(bw, (ContaPoupanca) conta);
					break;
				case "ContaInvestimento":
					gravarContaInvestimento(bw, (ContaInvestimento) conta);
					break;
					
				default:
					break;
				}
				bw.newLine();
			}
		}

		bw.close();
	}
	
	private void gravarContaCorrente(BufferedWriter bw, ContaCorrente cc) throws IOException {
		bw.write("1");
		bw.write(";");
		bw.write(cc.tarifa.toString());
		bw.write(";");
		bw.write(cc.limiteCredito.toString());
	}
	private void gravarContaPoupanca(BufferedWriter bw, ContaPoupanca cp) throws IOException {
		bw.write("2");
		bw.write(";");
		bw.write(ContaPoupanca.taxaRendimento.toString());

	}
	private void gravarContaInvestimento(BufferedWriter bw, ContaInvestimento ci) throws IOException {
		bw.write("3");
		bw.write(";");
		bw.write(ci.tarifa.toString());
		bw.write(";");
		bw.write(ci.taxaRendimento.toString());
	}

	public void carregarContas() throws IOException {
		InputStream is = new FileInputStream("contas.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine(); // primeira linha
		//10481;0.0;Gleidson;55546265302;1;10.0;1000.0
		String[] campos = null;
		Conta c = null;
		Integer i = 0;
		while (s != null) {
			campos = s.split(";");
			switch (campos[4]) {
			case "1":
				c = criarContaCorrente(campos);
				break;
			case "2":
				c = criarContaPoupanca(campos);
				
				break;
			case "3":
				c = criarContaInvestimento(campos);
				
				break;

			default:
				break;
			}
			contas[i++] = c;
			s = br.readLine();
		}
		br.close();
	}

	private Conta criarContaInvestimento(String[] campos) {
		ContaInvestimento ci = new ContaInvestimento();
		cadastrarConta(campos, ci);
		ci.tarifa = Double.parseDouble(campos[5]);
		ci.taxaRendimento = Double.parseDouble(campos[6]);
		return ci;
	}

	private Conta criarContaPoupanca(String[] campos) {
		ContaPoupanca cp = new ContaPoupanca();
		cadastrarConta(campos, cp);
		ContaPoupanca.taxaRendimento = Double.parseDouble(campos[5]);
		return cp;
	}

	private Conta criarContaCorrente(String[] campos) {
		ContaCorrente cc = new ContaCorrente();
		cadastrarConta(campos, cc);
		cc.tarifa = Double.parseDouble(campos[5]);
		cc.limiteCredito = Double.parseDouble(campos[6]);
		return cc;
	}
	
	private void cadastrarConta(String[] campos, Conta conta) {
		conta.setNumeroConta(Integer.parseInt(campos[0]));
		conta.setPessoa(new Pessoa());
		conta.setSaldo(Double.parseDouble(campos[1]));
		conta.getPessoa().nome = campos[2];
		conta.getPessoa().cpf = Long.parseLong(campos[3]);
	}
	
}
