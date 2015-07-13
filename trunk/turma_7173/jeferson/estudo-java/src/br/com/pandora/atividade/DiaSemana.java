package br.com.pandora.atividade;

public enum DiaSemana {
	
	SEGUNDA_FEIRA("Segunda Feira"),
	TERCA_FEIRA("Terça Feira"),
	QUARTA_FEIRA("Quarta Feira"),
	QUINTA_FEIRA("Quinta Feira"),
	SEXTA_FEIRA("Sexta Feira"),
	SABADO("Sabado"),
	DOMINGO("Domingo2");
	
	private DiaSemana(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

    
	
}
