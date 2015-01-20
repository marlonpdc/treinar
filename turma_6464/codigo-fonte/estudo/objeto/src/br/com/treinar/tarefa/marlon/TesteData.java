package br.com.treinar.tarefa.marlon;

import java.util.Calendar;
import java.util.Date;

public class TesteData {
	public static void main(String[] args) throws InterruptedException {
		/*Date d = new Date();
		
		Thread.sleep(1000L);
		
		System.out.println(d);		
		
		Date d2 = new Date();
		
		System.out.println(d);		
		System.out.println(d2);
		
		//não usual
		Date futuro = new Date("04/08/1994");
		System.out.println(futuro);*/
		
		Date futuro = new Date();
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1994);
		c.set(Calendar.MONTH, 12);
		c.set(Calendar.DAY_OF_MONTH, 8);
		
		futuro = c.getTime();
		
		System.out.println(futuro);
	}

}
