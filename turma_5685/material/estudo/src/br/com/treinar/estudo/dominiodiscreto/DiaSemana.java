package br.com.treinar.estudo.dominiodiscreto;

public enum DiaSemana {

	DOM("Domingo"),
	SEG("Segunda-Feira"),
	TER("Terça-Feira"),
	QUA("Quarta-Feira"),
	QUI("Quinta-Feira"),
	SEX("Sexta-Feira"),
	SAB("Sábado");
	
	private DiaSemana(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	public static DiaSemana getByDescription(String description) {
		for (DiaSemana ds : values()) {
			if (ds.getDescricao().equals(description)) {
				return ds;
			}
		}
		throw new IllegalArgumentException();
	}
	
	public static DiaSemana getByIndex(Integer index) {
		try {
			return values()[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException();
		}
	}
	
}
