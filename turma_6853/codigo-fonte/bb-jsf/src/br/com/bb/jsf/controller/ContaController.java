package br.com.bb.jsf.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


@ManagedBean
public class ContaController {

	private String mensagem;
	
	
	@PostConstruct
	private void init() {
		System.out.println("inicializado");
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	public void melhorarMensagem() {
		mensagem += " Maria Sophia";
	}
	
}
