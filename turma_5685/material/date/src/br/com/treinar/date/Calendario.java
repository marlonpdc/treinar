package br.com.treinar.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	
	public static void main(String[] args) throws ParseException {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = df.parse("03/12/1980");
		
		Calendar dateCalendar = Calendar.getInstance();
		dateCalendar.setTime(date);
		
		dateCalendar.add(Calendar.YEAR, 34);
		
		System.out.println(dateCalendar.get(Calendar.YEAR));

		
	}
	
	
}
