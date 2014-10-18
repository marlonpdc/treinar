package br.com.treinar.estudo.teste;

import br.com.treinar.estudo.contrato.Celular;
import br.com.treinar.estudo.modelo.IPhone6;
import br.com.treinar.estudo.modelo.LGG3;
import br.com.treinar.estudo.modelo.MotorolaRazerI;

public class Oiapoque {

	public static void main(String[] args) {
		
		Celular ip = new IPhone6();
		testarLigacao(ip);
		testarSMS(ip);
		testarDesligar(ip);

		Celular ri = new MotorolaRazerI();
		testarLigacao(ri);
		testarSMS(ri);
		testarDesligar(ri);
		
		LGG3 lg = new LGG3();
//		testarLigacao(lg);
//		testarSMS(gl);
//		testarDesligar(lg);
		
	}

	private static void testarLigacao(Celular c) {
		c.ligar();
	}
	private static void testarSMS(Celular c) {
		c.ligar();
	}
	private static void testarDesligar(Celular c) {
		c.ligar();
	}
	
}
