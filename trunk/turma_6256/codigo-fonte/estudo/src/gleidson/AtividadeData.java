package gleidson;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AtividadeData {

	public static void main(String[] args) {
		Calendar niver = Calendar.getInstance();
		niver.set(Calendar.DAY_OF_MONTH, 1);
		niver.set(Calendar.MONTH, 0);
		niver.set(Calendar.YEAR, 1980);
		Date dataAniversario = niver.getTime();		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String format = dateFormat.format(dataAniversario);
		
		System.out.println(format);
		dateFormat = new SimpleDateFormat("D");
		System.out.println("Semana: " + dateFormat.format(dataAniversario));
		
	}
	
}
