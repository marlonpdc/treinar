package br.com.treinar.estudo.dominiodiscreto;

public enum DiaSemana {

	SEGUNDA_FEIRA("Segunda Feira"),
	TERCA_FEIRA("Terça Feira"),
	QUARTA_FEIRA("Quarta Feira"),
	QUINTA_FEIRA("Quinta Feira"),
	SEXTA_FEIRA("Sexta Feira"),
	SABADO("Sabado"),
	DOMINGO("Domingo");
	
	private DiaSemana(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
	
}
