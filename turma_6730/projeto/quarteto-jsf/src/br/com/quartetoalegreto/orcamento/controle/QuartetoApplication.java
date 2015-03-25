package br.com.quartetoalegreto.orcamento.controle;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.quartetoalegreto.orcamento.modelo.StatusOrcamento;
import br.com.quartetoalegreto.orcamento.modelo.TipoEvento;
import br.com.quartetoalegreto.orcamento.modelo.TipoInstrumento;
import br.com.quartetoalegreto.orcamento.modelo.TipoTelefone;

@ApplicationScoped
@ManagedBean()
public class QuartetoApplication {

	private StatusOrcamento[] statusOrcamento;
	private TipoEvento[] tipoEvento;
	private TipoTelefone[] tipoTelefone;
	private TipoInstrumento[] tipoInstrumento;
	
	@PostConstruct
	private void init() {
		statusOrcamento = StatusOrcamento.values();
		tipoEvento = TipoEvento.values();
		tipoTelefone = TipoTelefone.values();
		tipoInstrumento = TipoInstrumento.values();
	}

	public StatusOrcamento[] getStatusOrcamento() {
		return statusOrcamento;
	}

	public void setStatusOrcamento(StatusOrcamento[] statusOrcamento) {
		this.statusOrcamento = statusOrcamento;
	}

	public TipoEvento[] getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento[] tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public TipoTelefone[] getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone[] tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public TipoInstrumento[] getTipoInstrumento() {
		return tipoInstrumento;
	}

	public void setTipoInstrumento(TipoInstrumento[] tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}
	
}
