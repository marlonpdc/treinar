package br.com.treinar.locadora.controller;

import java.util.ArrayList;
import java.util.List;
import br.com.treinar.locadora.model.Contrato;

public class BaseDados {

	private static BaseDados instance;
	private List<Contrato> contratos;
	
	private BaseDados() {
		super();
		contratos = new ArrayList<Contrato>();
	}
	
	static {
		instance = new BaseDados();
	}
	
	public static BaseDados getInstance() {
		return instance;
	}
	
	public List<Contrato> adicionarConta(Contrato contrato) {
		if (contrato != null) {
			contratos.add(contrato);
		}
		return (List<Contrato>) contratos;
	}

	public List<Contrato> recuperarContratos() {
		return this.contratos;
	}
	
	public Contrato recuperarContratoPorCodigo(int codigo) {
		Contrato novocontrato = new Contrato();
		novocontrato.setIdContrato(codigo);
		Integer index = (contratos.indexOf(novocontrato));
		return index != null ? contratos.get(index) : null;
	}
	
	public boolean existeContratos(List<Contrato> contas) {
		if (contas == null) {
			return false;
		}
		return true;
	}
}
