package estudo.date;

import java.util.Calendar;

public class ExemploCalendar {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		
		c.add(Calendar.YEAR, 10);
		
		
		c.set(Calendar.YEAR, 2012);
		c.set(Calendar.MONTH, 13);
		c.set(Calendar.DAY_OF_MONTH, 15);

		System.out.println(c.get(Calendar.MONTH));
		
		
		
		
		
		
	}
	
	
	
	
	
}
