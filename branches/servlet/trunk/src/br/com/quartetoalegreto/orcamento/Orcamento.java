package br.com.quartetoalegreto.orcamento;

import java.util.Date;

public class Orcamento {

	private String codigoOrcamento;
	private Cliente cliente;
	private Evento evento;
	private Double valor;
	private Date dataOrcamento;
	private Date dataValidade;
	private StatusOrcamento status;
	
	public String getCodigoOrcamento() {
		return codigoOrcamento;
	}
	public void setCodigoOrcamento(String codigoOrcamento) {
		this.codigoOrcamento = codigoOrcamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Date getDataOrcamento() {
		return dataOrcamento;
	}
	public void setDataOrcamento(Date dataOrcamento) {
		this.dataOrcamento = dataOrcamento;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public StatusOrcamento getStatus() {
		return status;
	}
	public void setStatus(StatusOrcamento status) {
		this.status = status;
	}
	
}
