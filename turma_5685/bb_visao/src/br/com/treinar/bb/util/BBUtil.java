package br.com.treinar.bb.util;

import java.util.Calendar;
import java.util.Date;

public class BBUtil {

	private static BBUtil instance;
	
	static {
		instance = new BBUtil();
	}
	
	public static BBUtil getInstance() {
		return instance;
	}
	
	public Date criarData(Integer dia, Integer mes, Integer ano) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.YEAR, ano);
		calendario.set(Calendar.MONTH, mes);
		calendario.set(Calendar.DAY_OF_MONTH, dia);
		calendario.set(Calendar.HOUR_OF_DAY, 0);
		calendario.set(Calendar.MINUTE, 0);
		calendario.set(Calendar.SECOND, 0);
		return calendario.getTime();
	}
	
}
