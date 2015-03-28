package gabriel.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MeuAniversario {
	
    public static void main(String[] args) {
    	Calendar c = Calendar.getInstance();
    	c.set(Calendar.DAY_OF_MONTH, 1);
    	c.set(Calendar.MONTH, 11);
    	c.set(Calendar.YEAR, 2001);
    	
    	System.out.println(c.getTime());
    	formatarData(c.getTime());
	}
    public static void formatarData(Date data) {
    	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    	System.out.println(df.format(data));
	}
	
		
	
}
