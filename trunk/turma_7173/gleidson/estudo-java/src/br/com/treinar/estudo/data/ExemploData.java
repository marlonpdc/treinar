package br.com.treinar.estudo.data;

import java.util.Date;

public class ExemploData {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		Date dataNascimento = new Date();
		
		System.out.println(dataNascimento);
		
		System.out.println(dataNascimento.getTime());
		
		
		Date antigo = new Date(1437084644228L);
		System.out.println(antigo);
		
		Date d = new Date(112, 10, 30);
		
		System.out.println(d);
		
		System.out.println(d.getDay());
		System.out.println(d.getMonth());
		System.out.println(d.getYear());

		Thread.sleep(10000l);
		
		int i = d.compareTo(new Date());
		
		System.out.println(i);
	}
	
}
