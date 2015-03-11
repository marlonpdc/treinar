package br.com.treinar.humberto;

import java.util.Random;

public class TesteExcecao {

	public static void main(String[] args) {
		Pao p;
		try {
			p = irmaoMaisVelho();
		} catch (NaoTemPaoException e) {
			System.out.println("Comer pao de queijo");
			//e.printStackTrace();
		}
	}
	
	public static Pao irmaoMaisVelho() throws NaoTemPaoException /*levanta|nao trata*/{
		Pao p = irmaoMaisNovo();
//		----CASO O ESTE METODO TRATE A EXCECAO----
//		try {
//			p = irmaoMaisNovo();
//		} catch (NaoTemPaoException e) {
//			System.out.println("Buscar em outra padaria");
//			// e.printStackTrace(); // Printa o caminho dos metodos
//		}
		System.out.println(p);
		return p;
	}

	public static Pao irmaoMaisNovo() throws NaoTemPaoException {
		Random gerador = new Random();
		Integer numero = gerador.nextInt(10) + 10;
		Pao p = null;
		if (numero < 15) {
			p = new Pao();
		} else {
			NaoTemPaoException npe = new NaoTemPaoException();
			npe.setDescricao("Mais novo: não deu pra comprar");
			throw npe;
		}	
		return p;
	}
}
