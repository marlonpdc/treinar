package br.com.treinar.bradesco;

import br.com.treinar.bradesco.banco.ITarifavel;

public class CartaoCredito implements ITarifavel {

	private Double limite;
	private Integer diaVencimento;
	private Titular titular;
	
	public CartaoCredito() {
		limite = 1000.;
	}
	
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public Integer getDiaVencimento() {
		return diaVencimento;
	}
	public void setDiaVencimento(Integer diaVencimento) {
		this.diaVencimento = diaVencimento;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	@Override
	public void tarifar() {
		limite -= 15;
	}
	
}
