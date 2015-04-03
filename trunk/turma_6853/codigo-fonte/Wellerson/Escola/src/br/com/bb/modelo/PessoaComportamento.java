package br.com.bb.modelo;

public class PessoaComportamento extends BaseEntity<Long> {

	private Pessoa pessoa;
	private IComportamento comportamento;
	private Comportamento tipoComportamento;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public IComportamento getComportamento() {
		return comportamento;
	}
	public void setComportamento(IComportamento comportamento) {
		this.comportamento = comportamento;
	}
	public Comportamento getTipoComportamento() {
		return tipoComportamento;
	}
	public void setTipoComportamento(Comportamento tipoComportamento) {
		this.tipoComportamento = tipoComportamento;
	}
	
}
