package br.com.bancodobrasil.teste.exercicio.exercicioRafaelExcecao;

import java.util.Scanner;

public class Viagem {

	private int diasViajando;
	private double distancia;
	private boolean idaEVolta = false;
	private double distanciaAdicional;
	private double distanciaTotal;
	private static Scanner entrada;



	public double getDiasViajando() {
		return diasViajando;
	}

	public void setDiasViajando(int diasViajando) {
		this.diasViajando = diasViajando;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) throws DistanciaInsuficienteException {
		
		if (distancia <= 0) {
			throw new DistanciaInsuficienteException("Distância inválida");
		} else {		
			this.distancia = distancia;
			System.out.println("A distância é: " + this.distancia + " km");
		}
	}

	public boolean getIdaEVolta() {
		return idaEVolta;
	}

	public void setIdaEVolta(boolean idaEVolta) {
		
		if (idaEVolta) {
			this.distancia *= 2;
		}
	}

	public double getDistanciaAdicional() {
		return distanciaAdicional;
	}

	public void setDistanciaAdicional(double distanciaAdicional) {
		this.distanciaAdicional = distanciaAdicional;
	}

	public double getDistanciaTotal() {
		return distanciaTotal;
	}

	public void setDistanciaTotal() {
		distanciaTotal = distancia + distanciaAdicional;
	}
	
	public static void main(String[] args) {
		
		Viagem viagem = new Viagem();
		entrada = new Scanner(System.in);
		
		try {
			System.out.println("Informe a distância: ");
			viagem.setDistancia(entrada.nextDouble());
		} catch (DistanciaInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
	}



}
