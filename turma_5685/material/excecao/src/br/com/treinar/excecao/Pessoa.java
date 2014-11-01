package br.com.treinar.excecao;

public class Pessoa {

	private String nome;
	private Long cpf;
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getCpf() {
		return cpf;
	}
	
	public void setCpf(Long cpf) throws Exception {
		Boolean cpfValido = cpf > 100;
		if (cpfValido) {
			this.cpf = cpf;			
		} else {
			Exception execao = new Exception("deu erro cpf invalido");
			throw execao;
		}
	}
}
