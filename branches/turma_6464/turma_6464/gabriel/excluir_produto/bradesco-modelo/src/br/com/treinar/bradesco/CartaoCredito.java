package br.com.treinar.bradesco;

import java.util.Date;

import br.com.treinar.bradesco.banco.ITarifavel;

public class CartaoCredito implements ITarifavel {

	private Double limite;
	private Integer diaVencimento;
	private Titular titular;
	private Long codigo;
	private Date dataAquisicao;
	
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
	
	@Override
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

	@Override
	public Date getDataAquisicao() {
		return dataAquisicao;
	}

	@Override
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	
}
