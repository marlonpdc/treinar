package br.com.treinar.aula.dois;

public class TesteEnum {

	
	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.ordinal());
		
		DiaSemana sabado = DiaSemana.valueOf("SABADO");
		
		System.out.println(sabado.getComercial());
		
		DiaSemana[] dias = DiaSemana.values();
		
		System.out.println(dias);
		
		DiaSemana diaTres = dias[3];
		
		System.out.println(diaTres.getComercial());
		
		
		
		
		
	}
	
}
