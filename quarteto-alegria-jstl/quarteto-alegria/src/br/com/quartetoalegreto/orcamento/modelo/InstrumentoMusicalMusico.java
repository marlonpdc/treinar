package br.com.quartetoalegreto.orcamento.modelo;

import java.util.Date;

public class InstrumentoMusicalMusico {

	private Musico musico;
	private InstrumentoMusical instrumentoMusical;
	private Date dataCriacao;
	
	public Musico getMusico() {
		return musico;
	}
	public void setMusico(Musico musico) {
		this.musico = musico;
	}
	public InstrumentoMusical getInstrumentoMusical() {
		return instrumentoMusical;
	}
	public void setInstrumentoMusical(InstrumentoMusical instrumentoMusical) {
		this.instrumentoMusical = instrumentoMusical;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
