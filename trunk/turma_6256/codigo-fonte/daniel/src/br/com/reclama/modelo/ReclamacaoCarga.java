package br.com.reclama.modelo;

import br.com.reclama.modelo.principal.Reclamacao;

public class ReclamacaoCarga extends Reclamacao {
	
	private Integer numeroNota;
	private Boolean entrege;
	
	public Integer getNumeroNota() {
		return numeroNota;
	}
	public void setNumeroNota(Integer numeroNota) {
		this.numeroNota = numeroNota;
	}
	public Boolean getEntrege() {
		return entrege;
	}
	public void setEntrege(Boolean entrege) {
		this.entrege = entrege;
	}
	
	
	
	

}
