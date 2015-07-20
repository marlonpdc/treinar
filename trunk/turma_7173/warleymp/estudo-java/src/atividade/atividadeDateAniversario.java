package atividade;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class atividadeDateAniversario {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_MONTH, 3);
		c.set(Calendar.MONTH, 3);
		c.set(Calendar.YEAR, 2015);
		
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, 10);
		c.add(Calendar.MONTH, 2);
		
		System.out.println(c.getTime());
		
		String datanascimentoStr = "03/04/1963";
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(formatador.format(new Date()));
		
	}

}
