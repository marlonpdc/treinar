package br.com.treinar.bradesco.banco;

import java.util.HashSet;
import java.util.Set;

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
	
//	public Integer getQuantidadeContas() {
//		return quantidadeContas;
//	}
//
//	public Conta[] recuperarContas() {
//		return produtos;
//	}
//
//
//	public CartaoCredito[] recuperarCartoesCredito() {
//		return cartoesCredito;
//	}
//
//	public PrevidenciaPrivada[] recuperarPlanosPrevidencia() {
//		return planosPrevidencia;
//	}
	
	
}
