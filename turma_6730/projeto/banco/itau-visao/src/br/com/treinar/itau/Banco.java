package br.com.treinar.itau;

import br.com.treinar.itau.modelo.util.ItauConstante;

public class Banco {

	public static void main(String[] args) {
		Itau i = new Itau();
		i.iniciar();
		System.out.println(ItauConstante.ItauConstanteVisao.MENSAGEM_FIM_PROGRAMA);
	}
	
}
