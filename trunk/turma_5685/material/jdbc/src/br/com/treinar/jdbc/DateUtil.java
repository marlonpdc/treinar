package br.com.treinar.jdbc;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	private static DateUtil instance;
	
	private DateUtil() {
		super();
	}
	
	static {
		instance = new DateUtil();
	}
	
	public static DateUtil getInstance() {
		return instance;
	}

	public Date criarData(int dia, int mes, int ano){
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, dia);
		calendario.set(Calendar.MONTH, mes);
		calendario.set(Calendar.YEAR, ano);

		Date date = calendario.getTime();
		return date;

	}

}
