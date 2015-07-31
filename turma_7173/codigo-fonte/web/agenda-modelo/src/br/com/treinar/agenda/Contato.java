package br.com.treinar.agenda;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Contato  implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date dataCadastro;
	private Pessoa pessoa;
	private List<Telefone> telefones;

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

}
