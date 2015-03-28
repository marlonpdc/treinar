package estudo.apidata;

import java.util.Calendar;
import java.util.Date;

public class TesteData {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		
		Date aniversarioDeprecated = new Date(1970, 01, 01, 0, 0, 0);
		System.out.println("Ano: " + aniversarioDeprecated.getYear());
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 3);
		c.set(Calendar.MONTH, 11);
		c.set(Calendar.YEAR, 1980);
		c.set(Calendar.HOUR, 12);
		c.set(Calendar.MINUTE, 4);
		c.set(Calendar.SECOND, 48);
		
		c.setTime(new Date());
		
		Date aniversario = c.getTime();
		System.out.println(aniversario);

		c.add(Calendar.DAY_OF_MONTH, 8);
		System.out.println("Daqui a oito dias: " + c.getTime());
		
		c.set(Calendar.DAY_OF_MONTH, 31);
		c.set(Calendar.MONTH, 1);
		c.set(Calendar.YEAR, 2015);
		
		System.out.println("31/02/2015: " + c.getTime());
		
		c.after(d);
		c.before(d);
		Calendar c2 = Calendar.getInstance();
		Integer compar = c.compareTo(c2);
				
		
	}
	
}
