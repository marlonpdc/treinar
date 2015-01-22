package br.com.treinar.tarefa.matheus;

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
	
	public static DiaSemana ordinal(int i) {
		
		DiaSemana d = null;
		
		switch (i) {
		case 0:
			d = DOMINGO;
			break;
		case 1:
			d = SEGUNDA_FEIRA;
			break;
		case 2:
			d = TERCA_FEIRA;
			break;
		case 3:
			d = QUARTA_FEIRA;
			break;
		case 4:
			d = QUINTA_FEIRA;
			break;
		case 5:
			d = SEXTA_FEIRA;
			break;
		case 6:
			d = SABADO;
			break;

		default:
			break;
		}
		return d;
		
	}

}
