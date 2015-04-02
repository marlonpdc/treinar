package br.com.bb.modelo;

public class PessoaComportamento {

	private Pessoa pessoa;
	private IComportamento comportamento;
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
	
	
	
}
