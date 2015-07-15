package br.com.treinar.estudo.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExemploPropagacao {
	
	public static void main(String[] args) {
		System.out.println("executando metodo main");
		metodoUm();
	}
	
	private static void metodoUm() {
		System.out.println("executando metodo um");
		try {
			metodoDois();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static void metodoDois() throws ParseException {
		System.out.println("executando metodo dois");
		metodoTres();
	}

	private static void metodoTres() throws ParseException {
		System.out.println("executando metodo tres");
		String a = null;
		try {
			new SimpleDateFormat().parse("28/02/2015");
			System.out.println(a.charAt(0));
		} catch (NullPointerException e) {
			//Logger.getLogger(ExemploException.class.getSimpleName()).log(Level.WARNING, "ExemploPropagacao", e.getCause());
			System.out.println("null pointer access");
		}
	}
	
}
