package net.gabriellima.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import net.gabriellima.objetos.Moto;

public class Teste {

	public static void main(String[] args) {
		List<Moto> motos = new ArrayList<>();
		
		Moto moto2 = new Moto();
		moto2.setModelo("CB 300R");
		moto2.setCor("Amarela");
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.YEAR, 2014);
		c2.set(Calendar.MONTH, 10);
		c2.set(Calendar.DAY_OF_MONTH, 25);
		moto2.setDataFabricacao(c2.getTime());
		moto2.setFabricante("Honda");
		moto2.setNumeroChassi("HSHDIE35453JSDK33");
		
		Moto moto = new Moto();
		moto.setModelo("Fazer 250");
		moto.setCor("Vermelha");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2010);
		c.set(Calendar.MONTH, 1);
		c.set(Calendar.DAY_OF_MONTH, 19);
		moto.setDataFabricacao(c.getTime());
		moto.setFabricante("Yamaha");
		moto.setNumeroChassi("SDHTS72394NSJHBDSH38");		
				
		motos.add(moto2);
		motos.add(moto);
		
		for (Moto motoCurrent : motos) {
			System.out.println(motoCurrent);
		}
		
		System.out.println("\n");
		
		Collections.sort(motos);
		
		for (Moto motoCurrent : motos) {
			System.out.println(motoCurrent);
		}
		
	}
	
}
