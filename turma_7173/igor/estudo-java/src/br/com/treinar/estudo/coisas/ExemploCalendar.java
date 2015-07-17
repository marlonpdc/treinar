package br.com.treinar.estudo.coisas;

import java.util.Calendar;
import java.util.Date;

public class ExemploCalendar {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_MONTH,  23);
		c.set(Calendar.MONTH, 00);
		c.set(Calendar.YEAR, 1987);
		
		System.out.println(c.getTime());
		
		c.setTime(new Date());
		c.add(Calendar.DAY_OF_MONTH, -15);
		
		System.out.println(c.getTime());		
	}
	
}
