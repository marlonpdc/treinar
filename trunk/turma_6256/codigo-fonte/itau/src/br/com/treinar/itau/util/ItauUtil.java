package br.com.treinar.itau.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import br.com.treinar.itau.exception.ContaNaoCadastradaException;
import br.com.treinar.itau.modelo.ContaCorrente;
import br.com.treinar.itau.modelo.ContaPoupanca;
import br.com.treinar.itau.modelo.principal.Conta;

public class ItauUtil extends Object {

	private static ItauUtil instance;

	public Conta[] contas;
	private Integer index;

	private ItauUtil() {
		super();
		index = 0;
		contas = new Conta[3];
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
			if (contas[i] != null && contas[i].numeroConta.equals(numeroConta)) {
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
			OutputStream os = new FileOutputStream("saida.txt", Boolean.TRUE);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			for (Conta conta : contas) {
				if (conta != null) {
					bw.write(conta.getClass().getSimpleName() + ";" + conta.numeroConta + ";" + conta.pessoa.nome);
					bw.write("\n");					
				}
			}
			bw.close();
		} catch (Exception e) {
			System.out.println("erro");
		}
	}


	public void carregarContas() {
		try {
			InputStream is = new FileInputStream("contas.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String contaStr = br.readLine();
			String campos[] = null;
			Conta c = null;
			while (contaStr != null) {
				campos = contaStr.split(";");
				switch (campos[0]) {
					case "ContaCorrente":
						c = new ContaCorrente(Integer.parseInt(campos[1]));
						//TODO Completar
						break;
					case "ContaPoupanca":
						c = new ContaPoupanca(Integer.parseInt(campos[1]));
						//TODO Completar
						break;

				default:
					break;
				}
				contaStr = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println("erro");
		}
	}

}
