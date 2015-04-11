package estudo.modelo.composicao;

import java.util.Date;

public class Funcionaro {

	private String nome;
	private Date dataNascimento;
	private IFuncao funcao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public IFuncao getFuncao() {
		return funcao;
	}
	public void setFuncao(IFuncao funcao) {
		this.funcao = funcao;
	}
	
}
