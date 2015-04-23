package br.com.treinar.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.treinar.modelo.TipoTelefone;

@ApplicationScoped
@ManagedBean
public class ApplicationController {

	private List<TipoTelefone> tiposTelefone;
	
	@PostConstruct
	private void init() {
		tiposTelefone = new ArrayList<TipoTelefone>();
		tiposTelefone.addAll(Arrays.asList(TipoTelefone.values()));
	}

	public List<TipoTelefone> getTiposTelefone() {
		return tiposTelefone;
	}

	public void setTiposTelefone(List<TipoTelefone> tiposTelefone) {
		this.tiposTelefone = tiposTelefone;
	}

	
}
