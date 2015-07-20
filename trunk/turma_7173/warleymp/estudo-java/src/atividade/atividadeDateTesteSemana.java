package atividade;

import java.util.Calendar;

public class atividadeDateTesteSemana {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		for (int i = 0; i < 8; i++) {
			c.set(Calendar.DAY_OF_MONTH, i);
			System.out.println(c.getTime());
			System.out.println(c.get(Calendar.DAY_OF_WEEK));
		}

//		c.set(Calendar.DAY_OF_MONTH, 3);
//		c.set(Calendar.MONTH, 3);
//		c.set(Calendar.YEAR, 2015);
//		
//		System.out.println(c.getTime());
//		
//		c.add(Calendar.DAY_OF_MONTH, 10);
//		c.add(Calendar.MONTH, 2);
//		
//		System.out.println(c.getTime());
		
	}

}
