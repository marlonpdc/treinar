package estudo.apidata;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatacaoData {
	public static void main(String[] args) throws ParseException {
		Date data = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String hojeStr = "28/03/2015";
		Date hojeDate = df.parse(hojeStr);
		System.out.println(df.format(data));
		System.out.println(hojeDate);
	}
}

