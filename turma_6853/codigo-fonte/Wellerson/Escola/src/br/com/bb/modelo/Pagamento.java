package br.com.bb.modelo;

import java.math.BigDecimal;

public class Pagamento extends BaseEntity<Long> {

	private BigDecimal valor;
	private Boolean aprovado;
	private Diretor aprovador;

	public void aprovar(Diretor diretor) {
		this.aprovador = diretor;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}

	public Diretor getAprovador() {
		return aprovador;
	}

	public void setAprovador(Diretor aprovador) {
		this.aprovador = aprovador;
	}

}
