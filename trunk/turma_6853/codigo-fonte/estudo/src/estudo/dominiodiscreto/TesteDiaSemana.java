package estudo.dominiodiscreto;

public class TesteDiaSemana {

	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.valueOf("SEGUNDA_FEIRA");
	
		
		switch (dia) {
			case DOMINGO:
				System.out.println(DiaSemana.DOMINGO);
				break;
			case SEGUNDA_FEIRA:
				System.out.println(DiaSemana.SEGUNDA_FEIRA);
				
				break;
			case TERCA_FEIRA:
				System.out.println(DiaSemana.TERCA_FEIRA);
				
				break;
			case QUARTA_FEIRA:
				System.out.println(DiaSemana.QUARTA_FEIRA);
				
				break;
			case QUINTA_FEIRA:
				System.out.println(DiaSemana.QUINTA_FEIRA);
				
				break;
			case SEXTA_FEIRA:
				System.out.println(DiaSemana.SEXTA_FEIRA);
				
				break;
			case SABADO:
				System.out.println(DiaSemana.SABADO);
				
				break;
	
			default:
				break;
		}
		
		
	}
	
}

