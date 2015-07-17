package br.com.treinar.estudo.coisas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ManipularDataText {

	public static void main(String[] args) {

		//String dataNascimentoStr = "23/01/1987";

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

		String dataFormatada = formatador.format(new Date());
		
		System.out.println(dataFormatada);
		
		String data = "16/08/2015";
		
		try {
			Date diaD = formatador.parse(data);
			System.out.println(diaD);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
