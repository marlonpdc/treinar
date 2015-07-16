package br.com.treinar.estudo.data;

import java.util.Calendar;
import java.util.Date;

public class ExemploCalendar {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 2012);
		
		System.out.println(c.getTime());
		
		//voltando a data para o dia de hoje
		c.setTime(new Date());
		
		c.add(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println(c.getTime());
		
		
	}
	
}
