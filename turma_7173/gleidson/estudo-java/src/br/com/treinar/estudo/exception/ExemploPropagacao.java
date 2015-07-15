package br.com.treinar.estudo.exception;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExemploPropagacao {
	
	public static void main(String[] args) {
		System.out.println("executando metodo main");
		metodoUm();
	}
	
	private static void metodoUm() {
		System.out.println("executando metodo um");
		metodoDois();
	}

	private static void metodoDois() {
		System.out.println("executando metodo dois");
		metodoTres();
	}

	private static void metodoTres() {
		System.out.println("executando metodo tres");
		String a = null;
		try {
			new SimpleDateFormat().parse("28/02/2015");
			System.out.println(a.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("null pointer access");
		} catch (Exception e) {
			e.printStackTrace();
			//Logger.getLogger(ExemploException.class.getSimpleName()).log(Level.WARNING, "ExemploPropagacao", e.getCause());
		}
	}
	
}
