package br.com.bb.modelo;

public class Diretor extends BaseEntity<Long> implements IComportamento {

	private Double participacaoLucro;
	private Pessoa pessoa;

	public Double getParticipacaoLucro() {
		return participacaoLucro;
	}

	public void setParticipacaoLucro(Double participacaoLucro) {
		this.participacaoLucro = participacaoLucro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
