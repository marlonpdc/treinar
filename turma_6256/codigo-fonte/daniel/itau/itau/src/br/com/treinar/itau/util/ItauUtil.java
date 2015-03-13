package br.com.treinar.itau.util;

import br.com.treinar.itau.modelo.principal.Conta;

public class ItauUtil {

	private static ItauUtil instance;
	
	public Conta conta;
	
	private ItauUtil() {
		super();
	}
	
	static {
		instance = new ItauUtil();		
	}
	
	public static ItauUtil getInstance() {
		return instance;
	}
	
}
