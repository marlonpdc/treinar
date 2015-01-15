package br.com.treinar.bradesco.banco;

public class Banco {

	private Conta[] contas;
	private Integer quantidadeContas;
	
	
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
	
}
