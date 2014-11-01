package br.com.treinar.locadora.model;

import java.io.Serializable;
import java.util.List;

import br.com.treinar.locadora.controller.BaseDados;
import br.com.treinar.locadora.model.Cliente;

public class Contrato implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idContrato;
	private String periodo;
	private double valor;
	private Cliente cliente;
	private Veiculo veiculo;
	
	public String toString() {
		return "Contrato: \n [idContrato=" + idContrato + ", \n Periodo=" + periodo
				+ " dias, \n Valor=" + valor + " reais, \n " + cliente + " , \n "
				+ veiculo + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idContrato;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrato other = (Contrato) obj;
		if (idContrato != other.idContrato)
			return false;
		return true;
	}

	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}

	public int getIdContrato() {
		return idContrato;
	}
	
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public String recuperarDados(){
		String dados = "";
		List<Contrato> contas = BaseDados.getInstance().recuperarContratos();
		for (Contrato c : contas) {
			if (c != null) {
				dados += c.toString();
				dados += "\n\n";				
			}
		}
		return dados;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}
}
