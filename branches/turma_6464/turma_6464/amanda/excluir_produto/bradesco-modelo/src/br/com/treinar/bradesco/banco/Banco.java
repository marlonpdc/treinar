package br.com.treinar.bradesco.banco;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

import br.com.treinar.bradesco.CartaoCredito;

public class Banco {

	private Set<IProduto> produtos;
	
	public Banco() {
		produtos = new HashSet<IProduto>();
	}

	public static Integer getNumerobanco() {
		return Constante.NUMERO_BANCO;
	}
	
	public Boolean adicionarProduto(IProduto p) {
		Boolean adicionou = Boolean.FALSE;
		adicionou = produtos.add(p);
		try {
			gravarProduto(p);
		} catch (Exception e) {
			System.out.println("nao gravou!");
		}
		return adicionou;
	}

	private void gravarProduto(IProduto p) throws Exception {
		OutputStream os = new FileOutputStream("produtos.txt");
	     OutputStreamWriter osw = new OutputStreamWriter(os);
	     
	     try (BufferedWriter bw = new BufferedWriter(osw)) {
	    	 bw.write(p.toString());
	     }
	}

	public Set<Conta> getContas() {
		Set<Conta> contas = new HashSet<Conta>();
		for (IProduto produto : produtos) {
			if (produto instanceof Conta) {
				contas.add((Conta) produto);
			}
		}
		
		return contas;
	}
	
	public Set<CartaoCredito> getCartoesCredito() {
		Set<CartaoCredito> cartoes = new HashSet<CartaoCredito>();
		for (IProduto produto : produtos) {
			if (produto instanceof Conta) {
				cartoes.add((CartaoCredito) produto);
			}
		}
		
		return cartoes;
	}
	
	
}
