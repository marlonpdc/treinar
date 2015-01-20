package br.com.treinar.tarefa.gabriel;

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
	
	//metodo para ordenar
	
	public static DiaSemana getOrdinal(Integer num){
		DiaSemana diaSemana = null;
		switch (num) {
			case 0:
				diaSemana = DOMINGO;
			break;
			case 1:
				diaSemana = SEGUNDA_FEIRA;
				break;
			case 2:
				diaSemana = TERCA_FEIRA;
				break;
			case 3:
				diaSemana = QUARTA_FEIRA;
				break;
			case 4:
				diaSemana = QUINTA_FEIRA;
				break;
			case 5:
				diaSemana = SEXTA_FEIRA;
				break;
			case 6:
				diaSemana = SABADO;
				break;

		default:
			System.out.println("Opção invalida.");
			break;
		}
		
		return diaSemana;
	}

}
