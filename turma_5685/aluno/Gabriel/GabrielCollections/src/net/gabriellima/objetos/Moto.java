package net.gabriellima.objetos;

import java.util.Date;

public class Moto implements Comparable<Moto> {

	private String numeroChassi;
	private String cor;
	private Date dataFabricacao;
	private String fabricante;
	private String modelo;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNumeroChassi() {
		return numeroChassi;
	}
	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	@Override
	public String toString() {
		return "Moto [numeroChassi=" + numeroChassi + ", cor=" + cor
				+ ", dataFabricacao=" + dataFabricacao + ", fabricante="
				+ fabricante + ", modelo=" + modelo + "]";
	}
	
	@Override
	public int compareTo(Moto moto) {
		return this.getDataFabricacao().compareTo(moto.getDataFabricacao());
	}

}
