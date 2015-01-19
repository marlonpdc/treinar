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
		
		dia = DiaSemana.getByOrdinal(0);
		
		System.out.println(dia);
		System.out.println(dia.ordinal());
		System.out.println(dia.getComercial());
		System.out.println(dia.getDescricao());
		
		switch (dia) {
		case DOMINGO:
			System.out.println("dormir");
			break;
		case SEGUNDA_FEIRA:
			
			break;
		case TERCA_FEIRA:
			
			break;
		case QUARTA_FEIRA:
			
			break;
		case QUINTA_FEIRA:
			
			break;
		case SEXTA_FEIRA:
			
			break;
		case SABADO:
			
			break;

		default:
			break;
		}
		
		
	}
	
}
