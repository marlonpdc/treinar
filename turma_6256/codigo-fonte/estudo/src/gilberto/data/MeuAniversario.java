package gilberto.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MeuAniversario {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1997);
		c.set(Calendar.DAY_OF_MONTH,16);
		c.set(Calendar.MONTH ,2);
		
		DateFormat df =  new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println(df.format(c.getTime()));
		
		

	}

}
