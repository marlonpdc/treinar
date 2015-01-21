package br.com.treinar.bradesco.banco;

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
	
	public Boolean adicionarProduto(IProduto c) {
		Boolean adicionou = Boolean.FALSE;
		adicionou = produtos.add(c);
		return adicionou;
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
