package br.com.treinar.itau.modelo.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


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
	
	public String formatarData(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(data);
	}
	
	
}
