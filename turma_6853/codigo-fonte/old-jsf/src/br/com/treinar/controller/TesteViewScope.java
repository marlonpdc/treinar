package br.com.treinar.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ViewScoped
@ManagedBean
public class TesteViewScope {

	
	private String teste;
	
	@PostConstruct
	private void init() {
		teste = "Testando";
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	
	
	
	
	
}
