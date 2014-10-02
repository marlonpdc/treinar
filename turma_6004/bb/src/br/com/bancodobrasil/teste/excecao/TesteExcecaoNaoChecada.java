package br.com.bancodobrasil.teste.excecao;

import java.io.File;
import java.io.IOException;

public class TesteExcecaoNaoChecada {

	public static void main(String[] args) throws IOException {
		
		File f = new File("c:/temp");
		
		
		f.createNewFile();
		
		
		try {
			Integer a = 1 / 0;			
		} catch (ArithmeticException e) {
			System.out.println("NAO PODE DIVIDIR POR ZERO!");
		}
		System.out.println("o programa não finalizou abruptamente");
	}
	
}
