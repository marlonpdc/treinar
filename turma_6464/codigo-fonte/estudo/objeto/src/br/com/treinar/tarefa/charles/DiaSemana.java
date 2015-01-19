package br.com.treinar.tarefa.charles;

public enum DiaSemana {

	DOMINGO("Domingo", Comercial.NAO_COMERCIAL),
	SEGUNDA_FEIRA("Segunda Feira", Comercial.COMERCIAL),
	TERCA_FEIRA("Terça Feira", Comercial.COMERCIAL),
	QUARTA_FEIRA("Quarta Feira", Comercial.COMERCIAL),
	QUINTA_FEIRA("Quinta Feira", Comercial.COMERCIAL),
	SEXTA_FEIRA("Sexta Feira", Comercial.COMERCIAL),
	SABADO("Sábado", Comercial.NAO_COMERCIAL);
	
	
	private DiaSemana(String descricao, Comercial comercial) {
		this.descricao = descricao;
		this.comercial = comercial;
	}

	private String descricao;
	private Comercial comercial;
	
	public String getDescricao() {
		return descricao;
	}
	public Comercial getComercial() {
		return comercial;
	}
	
	public static DiaSemana getByOrdinal(Integer ordinal){
	   return values()[ordinal];
	}
	
	//metodo para ordenar

}
