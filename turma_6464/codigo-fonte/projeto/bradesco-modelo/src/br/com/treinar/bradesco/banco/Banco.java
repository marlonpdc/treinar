package br.com.treinar.bradesco.banco;

import br.com.treinar.bradesco.CartaoCredito;

public class Banco {

	private Conta[] contas;
	private CartaoCredito[] cartoesCredito;
	private Integer quantidadeContas;
	private Integer quantidadeCartoes;
	
	
	public Banco() {
		contas = new Conta[Constante.QUANTIDADE_CONTA];
	}

	public static Integer getNumerobanco() {
		return Constante.NUMERO_BANCO;
	}
	
	public Boolean adicionarConta(Conta c) {
		Boolean adicionou = Boolean.FALSE;
		if (quantidadeContas < Constante.QUANTIDADE_CONTA) {
			contas[quantidadeContas++] = c;
			adicionou = Boolean.TRUE;
		}
		return adicionou;
	}
	public Boolean adicionarCartao(CartaoCredito c) {
		Boolean adicionou = Boolean.FALSE;
		if (quantidadeCartoes < Constante.QUANTIDADE_CARTAO) {
			cartoesCredito[quantidadeCartoes++] = c;
			adicionou = Boolean.TRUE;
		}
		return adicionou;
	}

	public Integer getQuantidadeContas() {
		return quantidadeContas;
	}

	public void setQuantidadeContas(Integer quantidadeContas) {
		this.quantidadeContas = quantidadeContas;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}

	public void setCartoesCredito(CartaoCredito[] cartoesCredito) {
		this.cartoesCredito = cartoesCredito;
	}

	public CartaoCredito[] getCartoesCredito() {
		return cartoesCredito;
	}
	
}
