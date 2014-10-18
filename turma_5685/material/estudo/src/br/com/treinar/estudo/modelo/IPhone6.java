package br.com.treinar.estudo.modelo;

import br.com.treinar.estudo.contrato.Celular;

public class IPhone6 implements Celular {

	@Override
	public void ligar() {
		System.out.println("Ligou primo rico");
	}

	@Override
	public void desligar() {
		System.out.println("Desligou primo rico");
	}

	@Override
	public void enviarSMS() {
		System.out.println("Enviou SMS primo rico");
	}

}
