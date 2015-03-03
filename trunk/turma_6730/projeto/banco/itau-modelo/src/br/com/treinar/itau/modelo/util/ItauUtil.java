package br.com.treinar.itau.modelo.util;


public class ItauUtil {

	
	private static ItauUtil instance;
	
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
