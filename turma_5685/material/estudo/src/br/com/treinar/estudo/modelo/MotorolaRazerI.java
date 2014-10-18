package br.com.treinar.estudo.modelo;

import br.com.treinar.estudo.contrato.Celular;

public class MotorolaRazerI implements Celular {

	@Override
	public void ligar() {
		System.out.println("Ligou MRI");
	}

	@Override
	public void desligar() {
		System.out.println("Desligou MRI");
		
	}

	@Override
	public void enviarSMS() {
		System.out.println("Enviou SMS MRI");
		
	}

	
	
	
}
