package br.com.treinar.aula.dois;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TesteDate {

	public static void main(String[] args) throws InterruptedException, ParseException {
		Date d = new Date();
		
		Thread.sleep(1000L);
		
		Date d2 = new Date();
		
		System.out.println(d);
		System.out.println(d2);
		
		//feio
		Date futuro = new Date(12, 9, 1980);
		
		System.out.println(futuro);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		c.set(Calendar.YEAR, 1980);
		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DAY_OF_MONTH, 9);
		
		futuro = c.getTime();
		System.out.println(futuro);
		
		c.add(Calendar.YEAR, 34);
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, 19);
		
		System.out.println(c.getTime());
		
		DateFormat df = new SimpleDateFormat("dd/MM/YYY");
		
		System.out.println(df.format(d.getTime()));
		
		Date novaData = df.parse("09/12/1980");
		df.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
		System.out.println(novaData);
	
		
	}
	
}
