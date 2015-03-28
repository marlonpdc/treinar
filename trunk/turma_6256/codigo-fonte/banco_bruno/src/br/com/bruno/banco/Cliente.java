package br.com.bruno.banco;

public class Cliente {
	
	private Integer cpf;
	private String nomeTitular;
	
	public String getNomeTitular(Conta contas) {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
}
