package estudo.date;

import java.util.Date;

@SuppressWarnings("deprecation")
public class ExemploData {

	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println(d);
		
		System.out.println(d.getTime());
		
		System.out.println(d.getDay());
		System.out.println(d.getMonth());
		System.out.println(d.getYear());
		
		Date d2 = new Date(45654654654l);
		System.out.println(d2);
		
		
		System.out.println(d.after(d2));
		
		
	}
	
}
