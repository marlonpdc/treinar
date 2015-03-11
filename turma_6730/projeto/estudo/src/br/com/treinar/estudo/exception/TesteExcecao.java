package br.com.treinar.estudo.exception;

import java.util.Random;
import java.util.Scanner;

public class TesteExcecao {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			Pao p;
			try {
				p = irmaoMaisVelho();
				System.out.println("dentada no pao " + p);
			} catch (NaoTemPaoException | SemDinheirException e) {
				System.out.println(e.getMessage());
			} catch (RuntimeException e) {
				System.out.println(e.getClass().getSimpleName());
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				sc.close();
				System.out.println("finally");
			}
		}
		
		try {
			System.out.println();
		} finally {
			
		}
		
	}


	private static Pao irmaoMaisVelho() throws NaoTemPaoException, SemDinheirException {

		Pao croquete;
		try {
			croquete = irmaoMaisNovo();
			System.out.println(croquete);
			return croquete;
		} catch (NaoTemPaoException e) {
			e.setDescricao("Mais velho: " + e.getDescricao());
			throw e;
		}
	}


	private static Pao irmaoMaisNovo() throws NaoTemPaoException, SemDinheirException {
		Random gerador = new Random();
		Integer numero = gerador.nextInt(10) + 10;
		Pao p = null;
		if (numero < 12) {
			p = new Pao();
		} else if(numero <= 15) {
			NaoTemPaoException npe = new NaoTemPaoException("NaoTemPaoException");
			npe.setDescricao("Mais novo: Rolou uma treta doida");
			throw npe;
		} else if(numero <= 17) {
			throw new SemDinheirException("SemDinheirException");
		} else {
			//p.toString();
		}
		return p;
	}

}
