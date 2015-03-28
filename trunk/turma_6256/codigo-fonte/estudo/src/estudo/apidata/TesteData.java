package estudo.apidata;

import java.util.Date;

public class TesteData {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		
		Date aniversario = new Date(1970,01,01,0,0,0);
		System.out.println("Ano: " + aniversario.getTime());
		
	}
	
}
