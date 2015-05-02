package br.com.treinar.agenda.controller.lib;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.agenda.modelo.TipoTelefone;

@ManagedBean(name="applicationController")
@ApplicationScoped
public class AgendaAppicationController {

	private List<TipoTelefone> tipos;
	
	public AgendaAppicationController() {
		tipos = Arrays.asList(TipoTelefone.values());
	}

	public List<TipoTelefone> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoTelefone> tipos) {
		this.tipos = tipos;
	}

}
