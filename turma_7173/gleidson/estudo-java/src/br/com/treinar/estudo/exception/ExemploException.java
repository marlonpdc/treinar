package br.com.treinar.estudo.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class ExemploException {

	
	public static void main(String[] args) {
		String[] nomes = new String[1];
		System.out.println("acessar posicao 2");
//		nomes[2] = "a";
		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println(parser.parse("28/02/2015"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
}
