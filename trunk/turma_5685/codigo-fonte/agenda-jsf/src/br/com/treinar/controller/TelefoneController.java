package br.com.treinar.controller;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TelefoneController {

	private Date data;

	@PostConstruct
	private void init() {
		//this.data = new Date();
	}

	public void salvar() {

	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
