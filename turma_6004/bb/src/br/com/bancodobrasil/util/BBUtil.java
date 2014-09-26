package br.com.bancodobrasil.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//TODO - Singleton
//TODO - Interface
public class BBUtil {

	private static BBUtil instance;
	
	static {
		instance = new BBUtil();
	}
	
	public static BBUtil getInstance() {
		return instance;
	}
	
	public String formatarData(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(data);
	}
	
	public static final String nomeBanco = "Banco do Brasil";
	
}
