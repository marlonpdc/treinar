package br.com.treinar.estudo.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ManipularDataText {

	public static void main(String[] args) {
		
		DateFormat formatador = new SimpleDateFormat("dd/MM-yyyy");
		
		String dataFormatada = formatador.format(new Date());
		
		System.out.println(dataFormatada);
		
		String data = "16/08-2015";

		try {
			Date diaD = formatador.parse(data);
			System.out.println(diaD);
			formatador = new SimpleDateFormat("EEEE");
			System.out.println(formatador.format(new Date()));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
