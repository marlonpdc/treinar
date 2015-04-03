package br.com.bb.modelo;

public enum Comportamento {

	ALUNO("Aluno"),
	PROFESSOR("Professor"),
	DIRETOR("Diretor");
	
	private Comportamento(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
}
