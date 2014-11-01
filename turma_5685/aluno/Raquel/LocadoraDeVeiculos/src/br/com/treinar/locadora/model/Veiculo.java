package br.com.treinar.locadora.model;

public class Veiculo {
	@Override
	public String toString() {
		return "Veiculo: \n [chassi=" + chassi + ", \n modelo=" + modelo + ", \n potencia=" + potencia + "]";
	}
	private long chassi;
	private String modelo;
	private double potencia;
		
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setChassi(long chassi) {
		this.chassi = chassi;
	}
	public long getChassi() {
		return chassi;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public double getPotencia() {
		return potencia;
	}
}
