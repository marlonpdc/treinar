package br.com.treinar.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TesteDate {

	
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		DateFormat df = new SimpleDateFormat("hh:mm:ss");
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		df.setTimeZone(timeZone);
		System.out.println(df.format(d));
		System.out.println(d);
		
		df = new SimpleDateFormat("dd/MM/yyyy");
		String dataNiver = "03/12/1980";
		
		System.out.println(df.format(d));
		
		Date dN = df.parse(dataNiver);
		
		System.out.println(d.before(dN));
		
		System.out.println(dN.getTime());
		
		df = new SimpleDateFormat("EEE");
		
		System.out.println(df.format(dN));
		
	}
	
}
