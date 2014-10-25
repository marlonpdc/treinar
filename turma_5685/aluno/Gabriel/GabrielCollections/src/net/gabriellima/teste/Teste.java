package net.gabriellima.teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.gabriellima.objetos.Moto;

public class Teste {

	public static void main(String[] args) {
		List<Moto> motos = new ArrayList<>();
		
		Moto moto = new Moto();
		moto.setModelo("CB 300R");
		moto.setCor("Amarela");
		moto.setDataFabricacao(new Date());
		moto.setFabricante("Honda");
		moto.setNumeroChassi("HSHDIE35453JSDK33");
		
		motos.add(moto);
		
		for (Moto motoCurrent : motos) {
			System.out.println(motoCurrent.getModelo());
			System.out.println(motoCurrent.getCor());
			System.out.println(motoCurrent.getDataFabricacao());
			System.out.println(motoCurrent.getFabricante());
			System.out.println(motoCurrent.getNumeroChassi());
		}
		
	}
	
}
