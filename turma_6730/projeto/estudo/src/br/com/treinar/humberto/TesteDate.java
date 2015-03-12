package br.com.treinar.humberto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteDate {
	
	
	public static void main(String[] args) {
		Date hoje = new Date();
		System.out.println(hoje);
		
		System.out.println(hoje.getDay()); // "deprecado" "método cortado" não utilizar!
//		System.out.println(hoje.after()));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, -1);
		Date ontem = c.getTime();
		System.out.println(ontem);
		

		System.out.print(c.get(Calendar.DAY_OF_MONTH) + "/");
		System.out.print(c.get(Calendar.MONTH) + "/"); // 0 a 11
		System.out.print(c.get(Calendar.YEAR));
		
		c.getTime().getTime(); // getTime1 = calendar => retorna Date; getTime2 = date = > retorna long 
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
	
	}

}
