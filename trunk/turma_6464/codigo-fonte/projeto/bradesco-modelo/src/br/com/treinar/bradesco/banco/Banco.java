package br.com.treinar.bradesco.banco;

public class Banco {

	private static final Integer numeroBanco;
	
	static {
		numeroBanco = 237;
	}

	public static Integer getNumerobanco() {
		return numeroBanco;
	}	
	
}
