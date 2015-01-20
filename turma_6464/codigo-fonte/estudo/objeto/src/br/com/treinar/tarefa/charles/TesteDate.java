//Criar um java bin é somente criar uma classe com construtor default e os métodos privados
//com os seus gets e setrs

package br.com.treinar.tarefa.charles;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteDate {
	
   public static void main(String[] args) throws InterruptedException, ParseException {
	
	  
	   Date d = new Date();
	   
	   System.out.println(d);
	   
	   /*Não deve ser utilizado pois é feio
	   		@SuppressWarnings("deprecation")
	   		Date futuro = new Date("12/09/1980");
	   		System.out.println(futuro);
	   	*/
	   
	   	Calendar c = Calendar.getInstance();
	   	c.set(Calendar.YEAR, 1980);
	   	c.set(Calendar.MONTH, 03);
	   	c.set(Calendar.DAY_OF_MONTH, 01);
	   	
	   	Date futuro = c.getTime();
	   	
	   	System.out.println(futuro);
	   	
	   	c.add(Calendar.YEAR, 34);
	   	c.add(Calendar.MONTH, 2);
	   	c.add(Calendar.DAY_OF_MONTH, 10);
	   	
	   	System.out.println(c.getTime());
	   	
	   	DateFormat df = new SimpleDateFormat("dd/mm/yyy HH:MM");
	   	
	   	System.out.println(df.format(d));
	   	
	   	Date novaData = df.parse("09/12/1980");
	   	System.out.println(novaData);

   }

}
