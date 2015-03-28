package estudo.execao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class ExcecaoChecada {

	public static void main(String[] args) {
		System.out.println("Excecoes checadas");
		try {
			metodo();
		} catch (ParseException e) {
			System.out.println("Data invalida.");
		}
	}

	private static void metodo() throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String data = JOptionPane.showInputDialog("Data");
		Date d = df.parse(data);
		System.out.println(d);	
	}

}
