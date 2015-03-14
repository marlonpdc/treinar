package estudo.dominiodiscreto;

public enum DiaSemana {

	SEGUNDA_FEIRA("Segunda-Feira"),
	TERCA_FEIRA("Terça-Feira"),
	QUARTA_FEIRA("Quarta-Feira"),
	QUINTA_FEIRA("Quinta-Feira"),
	SEXTA_FEIRA("Sexta-Feira"),
	SABADO("Sábado"),
	DOMINGO("Domingo");
	
	private String descricao;
	
	private DiaSemana(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	@Override
	public String toString() {
		return descricao;
	}
	
}
