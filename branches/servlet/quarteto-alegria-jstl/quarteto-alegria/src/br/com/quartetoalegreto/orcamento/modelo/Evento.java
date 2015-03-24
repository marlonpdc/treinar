package br.com.quartetoalegreto.orcamento.modelo;

import java.util.Date;
import java.util.List;

public class Evento {

	private Date dataInicio;
	private Date dataTermino;
	private String endereco;
	private TipoEvento tipoEvento;
	private List<Musico> musicos;
	private List<InstrumentoMusicalMusico> instrumentos;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public List<Musico> getMusicos() {
		return musicos;
	}
	public void setMusicos(List<Musico> musicos) {
		this.musicos = musicos;
	}
	public List<InstrumentoMusicalMusico> getInstrumentos() {
		return instrumentos;
	}
	public void setInstrumentos(List<InstrumentoMusicalMusico> instrumentos) {
		this.instrumentos = instrumentos;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	
}
