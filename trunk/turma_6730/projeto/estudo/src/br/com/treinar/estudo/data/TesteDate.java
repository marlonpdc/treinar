package br.com.treinar.estudo.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		//vide 1
		System.out.println(hoje.getDay());
		//vide 2 1426117472028
		System.out.println(hoje.getMonth());
		//vide 3
		System.out.println(hoje.getYear());
		
		Long inico = new Date().getTime();
		for (int i = 0; i < 10000; i++) {
			hoje = new Date();		
		}
		Long fim = new Date().getTime();
		
		Long tempoGasto = fim - inico;
		System.out.println(tempoGasto);
		
		
		
		// construtor nao deve ser utilizado @Deprecated
		//Date ontem = new Date(118, 2, 10);
		//System.out.println(ontem);
		
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.YEAR, 2015);
		c.set(Calendar.HOUR_OF_DAY, 12);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		System.out.print(c.get(Calendar.DAY_OF_MONTH) + "/");
		System.out.print(c.get(Calendar.MONTH)  + "/");
		System.out.print(c.get(Calendar.YEAR) + " ");
		System.out.print(c.get(Calendar.HOUR_OF_DAY) + ":");
		System.out.print(c.get(Calendar.MINUTE) + ":");
		System.out.print(c.get(Calendar.SECOND));
		System.out.println();
		System.out.println(formatador.format(c.getTime()));
		
		System.out.println(c.getTime().getTime());

		String dataStr = "15/03/2015";
		try {
			Date dataManifestacao = formatador.parse(dataStr);
			formatador = new SimpleDateFormat("EEEE hh:mm:ss");
			System.out.println(formatador.format(dataManifestacao));
		} catch (ParseException e) {
			System.out.println("Formato inválido");;
		}
		
		
	}
	
}
